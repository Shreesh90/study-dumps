package ParkingLot;

import ParkingLot.Strategy.CostComputationStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation(CostComputationStrategy costComputationStrategy) {
        super(costComputationStrategy);
    }
}
