package Designs.ParkingLot;

import Designs.ParkingLot.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList = new ArrayList<>();
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    void findParkingSpot() {} ;
    void parkVehicle(Vehicle vehicle) {} ;
    void removeVehicle(Vehicle vehicle) {} ;

}
