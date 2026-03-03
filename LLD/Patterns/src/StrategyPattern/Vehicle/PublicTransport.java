package StrategyPattern.Vehicle;

import StrategyPattern.DriveStrategy.NormalDriveStrategy;

public class PublicTransport extends Vehicle {

    public PublicTransport() {
        super(new NormalDriveStrategy());
    }
}
