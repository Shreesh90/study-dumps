package NullPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 0;
    }

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}
