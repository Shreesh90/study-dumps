package Designs.VehicleRentalSystem;

import java.util.List;

public class RentalManagementSystem {

    List<Store> stores;
    List<User> users;

    public RentalManagementSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    // CRUD operations on stores and user - add, delete

    public Store getStore(int storeId) {
        return stores.stream().filter(store -> store.getStoreId() == storeId).findFirst().get();
    }
}
