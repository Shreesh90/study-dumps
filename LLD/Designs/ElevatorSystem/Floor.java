package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

public class Floor {
    int floor_number;
    ExternalButton up;
    ExternalButton down;

    public Floor(int id, ExternalButtonDispatcher disp) {
        this.floor_number = id;
        up = new ExternalButton(disp);
        down = new ExternalButton(disp);
    }

    public void pressUpButton() {
        up.pressButton(floor_number, Direction.UP);
    }

    public void pressDownButton() {
        down.pressButton(floor_number, Direction.DOWN);
    }
}
