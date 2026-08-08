package NullPattern;

public class Main {
    public static void main(String[] args) {
        try {
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle vehicle = VehicleFactory.getVehicle("BIKE");

            System.out.println(vehicle.getNumberOfWheels());
            System.out.println(vehicle.getFuelCapacity());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
