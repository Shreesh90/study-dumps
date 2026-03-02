package Designs.VehicleRentalSystem;

import java.util.List;

public class Store {
    int storeId;
    Location location;
    VehicleInventoryManagement vehicleInventoryManagement;
    List<Reservation> reservations;

    public int getStoreId() {
        return this.storeId;
    }

}
