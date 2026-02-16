package DesignPatterns.StrategyPattern.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving with sports capabilities");
        
    }
    
}
