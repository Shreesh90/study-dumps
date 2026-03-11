package NullPattern;

public class CarVehicle implements Vehicle{

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public int getFuelCapacity() {
        return 13;
    }
}
