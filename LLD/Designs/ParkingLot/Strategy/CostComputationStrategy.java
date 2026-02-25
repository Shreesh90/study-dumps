package Designs.ParkingLot.Strategy;

import Designs.ParkingLot.ParkingSpot;
import Designs.ParkingLot.Ticket;

public abstract class CostComputationStrategy {

    public int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        return 0;
    };
}
