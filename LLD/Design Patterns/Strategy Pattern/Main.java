import java.util.ArrayList;
import java.util.List;

import Vehicle.OffroadVehicle;
import Vehicle.PublicTransport;
import Vehicle.SportsVehicle;
import Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new SportsVehicle());
        vehicles.add(new OffroadVehicle());
        vehicles.add(new PublicTransport());

        for(Vehicle vehicle: vehicles) {
            vehicle.drive();
        }
    }
}
