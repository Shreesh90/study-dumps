package Vehicle;

import DriveStrategy.NormalDriveStrategy;

public class PublicTransport extends Vehicle {

    public PublicTransport() {
        super(new NormalDriveStrategy());
    }
}
