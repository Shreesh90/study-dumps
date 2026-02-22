package Designs.ParkingLot.Strategy;

import Designs.ParkingLot.ParkingSpot;
import Designs.ParkingLot.Ticket;

public class HourlyCostComputationStrategy extends CostComputationStrategy{

    @Override
    int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        // calculate time in hours * parkingSpot.getPrice();
        return 0;
    }
}
