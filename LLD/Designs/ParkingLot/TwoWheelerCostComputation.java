package Designs.ParkingLot;

import Designs.ParkingLot.Strategy.CostComputationStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation(CostComputationStrategy costComputationStrategy) {
        super(costComputationStrategy);
    }
}
