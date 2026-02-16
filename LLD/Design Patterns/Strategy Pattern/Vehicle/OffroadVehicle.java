package Vehicle;

import DriveStrategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }

    // @Override
    // public void drive() {
    //     System.out.println("Driving with Sporty capabilities");
    // }
}
