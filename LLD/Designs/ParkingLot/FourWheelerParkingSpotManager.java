package Designs.ParkingLot;

import Designs.ParkingLot.Strategy.NearLiftParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> fourWheelerParkingSpotList = new ArrayList<>();

    public FourWheelerParkingSpotManager(List<ParkingSpot> list) {
        super(list, new NearLiftParkingStrategy());
    }

    // Override the t=other methods of parent according to the two wheeler logic
}
