package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.DriveStrategy.NormalDriveStrategy;

public class PublicTransport extends Vehicle {

    public PublicTransport() {
        super(new NormalDriveStrategy());
    }
}
