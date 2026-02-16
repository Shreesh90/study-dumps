package DesignPatterns.StrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving with Normal capabilities");
    }
    
}
