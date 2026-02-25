package Designs.ParkingLot.Gates;

import Designs.ParkingLot.*;
import Designs.ParkingLot.Factory.CostComputationFactory;
import Designs.ParkingLot.Factory.ParkingSpotManagerFactory;

public class ExitGate {
    Vehicle vehicle;
    Ticket ticket;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    ParkingSpot parkingSpot;
    CostComputationFactory costComputationFactory;
    CostComputation costComputation;

    public ExitGate(CostComputationFactory costComputationFactory) throws Exception {
        this.costComputationFactory = costComputationFactory;
        this.costComputation = costComputationFactory.getCostComputationClass(vehicle.getVehicleType());
    }

    int computePrice() {
        return costComputation.getCost(ticket, parkingSpot);
    };

    void receivePayment() {};

    void freeParkingSpot() {};

}
