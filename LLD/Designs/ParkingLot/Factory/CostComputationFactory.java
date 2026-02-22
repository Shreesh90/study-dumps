package Designs.ParkingLot.Factory;

import Designs.ParkingLot.*;
import Designs.ParkingLot.Strategy.HourlyCostComputationStrategy;
import Designs.ParkingLot.Strategy.MinuteCostComputationStrategy;

public class CostComputationFactory {

    public CostComputation getCostComputationClass(VehicleType vehicleType) throws Exception {
        switch (vehicleType) {
            case VehicleType.TwoWheeler -> {
                return new TwoWheelerCostComputation(new HourlyCostComputationStrategy());
            }
            case VehicleType.FourWheeler -> {
                return new FourWheelerCostComputation(new MinuteCostComputationStrategy());
            }
            default -> throw new Exception("Vehicle not supported");
        }
    }
}
