package ParkingLot;

import ParkingLot.Strategy.CostComputationStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation(CostComputationStrategy costComputationStrategy) {
        super(costComputationStrategy);
    }
}
