package Designs.ParkingLot.Strategy;

import Designs.ParkingLot.ParkingSpot;
import Designs.ParkingLot.Ticket;

public class MinuteCostComputationStrategy extends CostComputationStrategy {

    @Override
    int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        // calculate time in minutes * parkingSpot.getPrice();
        return 0;
    }
}
