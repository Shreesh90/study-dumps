public class MyHashMap<K, V> {
    public static final int INITIAL_SIZE = 1 << 4; // 16
    public static final int MAXIMUM_SIZE = 1 << 30;

    Entry[] hashTable;

    public MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_SIZE) ? MAXIMUM_SIZE : n + 1;
    }

    class Entry<K, V> {
        K key;
        V value;
        Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }

        public K getKey() {
            return key;
        }
        public void setKey(K k) {
            key = k;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V v) {
            value = v;
        }
    }

    public void put(K k, V v) {
        int idx = k.hashCode() % hashTable.length;

        if (hashTable[idx] == null) {
            Entry entry = new Entry(k ,v);
            hashTable[idx] = entry;
        } else {
            Entry curr = hashTable[idx];
            Entry prev = hashTable[idx];
            while(curr != null) {
                if(curr.getKey() == k) {
                    curr.setValue(v);
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = new Entry(k, v);
        }
    }

    public V get(K k) {
        int idx = k.hashCode() % hashTable.length;

        if(hashTable[idx] == null) {
            return null;
        } else {
            Entry curr = hashTable[idx];
            while(curr != null) {
                if(curr.getKey() == k) {
                    return (V)curr.getValue();
                }
                curr = curr.next;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        MyHashMap<String, String> map = new MyHashMap<>(7);
        map.put("1", "hi");
        map.put("2", "my");
        map.put("3", "name");
        map.put("4", "is");
        map.put("5", "Shrayansh");
        map.put("6", "how");
        map.put("7", "are");
        map.put("8", "you");
        map.put("9", "friends");
        map.put("10", "?");

        String value = map.get("9");
        System.out.println(value);
    }
}