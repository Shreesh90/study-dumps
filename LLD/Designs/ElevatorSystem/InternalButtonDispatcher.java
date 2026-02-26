package Designs.ElevatorSystem;

import java.util.List;

public class InternalButtonDispatcher {

    public void submitRequest(int floor, ElevatorCarController elevatorCarController) {
        elevatorCarController.submitNewRequest(floor);

    }
}
