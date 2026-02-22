package Designs.ParkingLot.Factory;

import Designs.ParkingLot.FourWheelerParkingSpotManager;
import Designs.ParkingLot.ParkingSpotManager;
import Designs.ParkingLot.TwoWheelerParkingSpotManager;
import Designs.ParkingLot.VehicleType;

public class ParkingSpotManagerFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) throws Exception {

        // We will need to see how list is passed as we cannot make new list everytime a new vehicle arrives;

        switch(vehicleType) {
            case VehicleType.TwoWheeler -> {
                return new TwoWheelerParkingSpotManager(null);
            }
            case VehicleType.FourWheeler -> {
                return new FourWheelerParkingSpotManager(null);
            }
            default -> throw new Exception("Vehicle Type not supported");
        }
    }
}
