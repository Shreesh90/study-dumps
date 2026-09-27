# Scaling Reads

## 1. Optimize within Database
### 1.1 Indexing
* Without indexing databse performs full table scan - O(n)
* With index, it can jump directly to the relevant row - O(logn)
* B-tree index: most common for general query
* Hash index: work well for excat matches
* specialised index: full search text/geographic queries
* Modern hardware and database engines handle well-designed indexes efficiently. In interviews, confidently add indexes for your query patterns - under-indexing kills more applications than over-indexing ever will.
  
### 1.2 Hardware upgrades
### 1.3 Denormalization Strategies
* Normalization - process of structuring data to reduce redundancy by splitting information across multiple tables to avoid storing duplicate data
* denormalization  - the opposite of normalization where you store redundant data
  * trades storage for speed.
* Denormalization is a classic example of optimizing for reads at the expense of writes.
* Storing duplicate data makes reads faster but writes more complex

## 2. Scale Your Database Horizontally
### 2.1 Read Replicas
* Read replicas copy data from your primary database to additional servers.
* All writes go to the primary, but reads can go to any replica
* If your primary database fails, you can promote a replica to become the new primary, minimizing downtime.
* Leader-follower replication is the standard approach

> * The key challenge is replication lag. When you write to the primary, it takes time to propagate to replicas. Users might not see their own changes immediately if they're reading from a lagging replica.
> * You need to understand the trade-offs between synchronous and asynchronous replication. Synchronous replication ensures data consistency but introduces latency. Asynchronous replication is faster but introduces potential data inconsistencies. 


### 2.2 Database Sharding
* Read replicas distribute load but don't reduce the dataset size that each database needs to handle. 
* Sharding helps in two main ways: 
  * smaller datasets mean faster individual queries 
  * distributes read load across multiple databases
* Ways to do:
  * Functional Sharding: Split data by business logic - user, product, orders etc.
  * Geographic Sharding: Keeping US, Europe, Asia user data in their own geographies
* Sharding adds significant operational complexity and is primarily a **write scaling technique**

## 3. Add External Caching Layers
* After optimising database, if more optimisation is needed. Two ways:
  * Add read replicas
  * Add caching layer (better performance for read-heavy workloads)
  
### 3.1 Application-Level Caching
* Cache sits between Application and DB. Application checks cache first
* Inmemory Cache: Redis, Memcached
* Cache invalidation is important to ensure we dont serve stale data. Ways to do:
  * **TTL:** Simple to implement but can serve stale data
  * **Write-through invalidation:** 
    * Update/delete cache entries immediately when writing to the database. 
    * Ensures consistency but adds latency to write operations
  * **Write-behind invalidation:** 
    * Queue invalidation events to process asynchronously. 
    * Reduces write latency but introduces a window of stale data
  * **Tagged invalidation:** 
    * Associate cache entries with tags. 
    * Invalidate all entries with a specific tag when related data changes
  * **Versioned keys:**
    * Include version numbers in cache keys.
    * Increment the version on updates.
> Systems use mix of invalidation approaches. Short TTLs for critical data

### 3.2 CDN and Edge Caching
* CDN extend caching beyond data center to global edge locations.
* For read-heavy applications, CDN caching can reduce origin load by 90% or more
* The trade-off is managing cache invalidation across scores of edge locations. The performance gains, though, usually justify the extra work.
> CDNs only make sense for data accessed by multiple users. Focus CDN caching on content with natural sharing patterns - public posts, product catalogs, or search results.

# Dive Deep
### 1. "What happens when your queries start taking longer as your dataset grows?"
* Add index for the relevant columns

### 2. "How do you handle millions of concurrent reads for the same cached data?"
* First solution is **Request Coalescing**
  * Combining multiple requests for the same key into a single request
  * Happens inside each application server
```
   Requests -> App server -> Cache miss
                    |
           first request -> DB fetch
           later requests -> wait for same result
                    |
              populate cache -> return to all
```

* When coalescing isn't enough for extreme loads, you need to distribute the load itself
* Cache key fanout spreads a single hot key across multiple cache entries. Store identical copy of cache under multiple different keys
* Multiple differnt keys adds redundance in the cahce but its a small price to ensure availability of the application under heavy load.

### 3. "What happens when multiple requests try to rebuild an expired cache entry simultaneously?"
* **Cache Stampede:** TTL for a Cache serving millions of request expires and suddenly all the requests hitting DB
* **Distributed Lock (Solution 1)**
  * Only first request notices cache miss, acquires the lock, query the DB and populate the cache
  * All other request wait for the rebuild to happen
  * Complex to handle if rebuild fails or takes too much of time, other requests might timeout
* **Probabilistic early refresh (Solution 2)**
  * Refresh the TTL for the cache key as it approaches the timeout

### 4. "How do you handle cache invalidation when data updates need to be immediately visible?"
* Hard to invalidate cahce on multiple layers: Redis, CDN edges, browser caches
* **Cache versioning**
  * Each record has a version number stored in the database (not in the cache). 
  * Whenever the record is updated, the version is incremented in the same transaction.
