package ParkingLot.Strategy;

import ParkingLot.ParkingSpot;
import ParkingLot.Ticket;

public class HourlyCostComputationStrategy extends CostComputationStrategy{

    @Override
    public int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        // calculate time in hours * parkingSpot.getPrice();
        return 0;
    }
}
