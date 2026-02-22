package Designs.ParkingLot;

public abstract class ParkingSpot {
    int id;
    int floor;
    boolean isEmpty;
    Vehicle vehicle;

//    public ParkingSpot()


    void parkVehicle() {};
    void removeVehicle() {};
    int getPrice() {
        // Return Base price
    };

}
