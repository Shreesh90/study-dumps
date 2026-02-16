package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.DriveStrategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }

    // @Override
    // public void drive() {
    //     System.out.println("Driving with Sporty capabilities");
    // }
}
