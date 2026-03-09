package ParkingLot.Strategy;

import ParkingLot.ParkingSpot;
import ParkingLot.Ticket;

public abstract class CostComputationStrategy {

    public int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        return 0;
    };
}
