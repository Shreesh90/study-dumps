package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.DoorState;

public class Door {
    DoorState doorState;

    public Door() {
        this.doorState = DoorState.CLOSE;
    }

    public String getState() {
        return doorState.toString();
    }

    public void openGate(int id) {
        this.doorState = DoorState.OPEN;
        System.out.println("Opening the door for Elevator ID: " + id);
    }

    public void closeGate(int id) {
        this.doorState = DoorState.CLOSE;
        System.out.println("Closing the door for Elevator ID: " + id);
    }
}
