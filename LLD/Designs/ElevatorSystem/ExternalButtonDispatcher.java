package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

public class ExternalButtonDispatcher {
    ElevatorScheduler elevatorScheduler;

    public ExternalButtonDispatcher(ElevatorScheduler elevatorScheduler) {
        this.elevatorScheduler = elevatorScheduler;
    }

    public void submitRequest(int floor, Direction direction) {
        ElevatorCarController elevatorCarController = elevatorScheduler.getElevatorCarControllerBasedOnStrategy(floor, direction);
        elevatorCarController.submitNewRequest(floor);
    };
}
