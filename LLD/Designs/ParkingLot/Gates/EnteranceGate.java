package Designs.ParkingLot.Gates;

import Designs.ParkingLot.Factory.ParkingSpotManagerFactory;
import Designs.ParkingLot.ParkingSpotManager;
import Designs.ParkingLot.Ticket;
import Designs.ParkingLot.Vehicle;
import Designs.ParkingLot.VehicleType;

public class EnteranceGate {
    Vehicle vehicle;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager ParkingSpotManager;
    Ticket ticket;

    void getParkingManager(VehicleType vehicleType) {};
    void findParkingSpace(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {};
    void bookParkingSpace(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {};
    void generateTicket(Vehicle vehicle) {};

}
