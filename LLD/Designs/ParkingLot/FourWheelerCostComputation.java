package Designs.ParkingLot;

import Designs.ParkingLot.Strategy.CostComputationStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation(CostComputationStrategy costComputationStrategy) {
        super(costComputationStrategy);
    }
}
