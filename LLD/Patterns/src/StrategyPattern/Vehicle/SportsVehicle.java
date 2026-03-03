package StrategyPattern.Vehicle;

import StrategyPattern.DriveStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

    // @Override
    // public void drive() {
    //     System.out.println("Driving with Sporty capabilities");
    // }
    
}
