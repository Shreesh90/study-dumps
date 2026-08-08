package NullPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "CAR" -> {
                return new CarVehicle();
            }
        }
        return new NullVehicle();
    }
}
