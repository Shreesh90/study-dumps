package ParkingLot;

// import Designs.ParkingLot.Strategy.NearExitParkingStrategy;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.Strategy.NearExitParkingStrategy;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    List<ParkingSpot> twoWheelerParkingSpotList = new ArrayList<>();

    public TwoWheelerParkingSpotManager(List<ParkingSpot> list) {
        super(list, new NearExitParkingStrategy());
    }

    // Override the t=other methods of parent according to the two wheeler logic
}
