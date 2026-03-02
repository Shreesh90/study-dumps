package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

public class ExternalButton {
    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    void pressButton(int floor, Direction direction) {
        externalButtonDispatcher.submitRequest(floor, direction);
    }
}
