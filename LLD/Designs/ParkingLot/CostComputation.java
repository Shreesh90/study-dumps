package Designs.ParkingLot;

import Designs.ParkingLot.Strategy.CostComputationStrategy;

public abstract class CostComputation {
    CostComputationStrategy costComputationStrategy;
    public CostComputation(CostComputationStrategy costComputationStrategy) {
        this.costComputationStrategy = costComputationStrategy;
    }

    public int getCost(Ticket ticket, ParkingSpot parkingSpot) {
        return costComputationStrategy.getCost(ticket, parkingSpot);
    }
}
