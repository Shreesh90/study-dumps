package ParkingLot.Factory;

import ParkingLot.*;
import ParkingLot.Strategy.HourlyCostComputationStrategy;
import ParkingLot.Strategy.MinuteCostComputationStrategy;

public class CostComputationFactory {

    public CostComputation getCostComputationClass(VehicleType vehicleType) throws Exception {
        switch (vehicleType) {
            case TwoWheeler -> {
                return new TwoWheelerCostComputation(new HourlyCostComputationStrategy());
            }
            case FourWheeler -> {
                return new FourWheelerCostComputation(new MinuteCostComputationStrategy());
            }
            default -> throw new Exception("Vehicle not supported");
        }
    }
}
