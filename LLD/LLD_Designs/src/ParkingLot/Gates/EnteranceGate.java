package ParkingLot.Gates;

import ParkingLot.Factory.ParkingSpotManagerFactory;
import ParkingLot.ParkingSpotManager;
import ParkingLot.Ticket;
import ParkingLot.Vehicle;
import ParkingLot.VehicleType;

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
