package Designs.ElevatorSystem;

public class InternalButton {

    InternalButtonDispatcher internalButtonDispatcher;
    ElevatorCarController elevatorCarController;

    public InternalButton(InternalButtonDispatcher internalButtonDispatcher,
                          ElevatorCarController elevatorCarController) {
        this.internalButtonDispatcher = internalButtonDispatcher;
        this.elevatorCarController = elevatorCarController;
    }

    public void pressButton(int floor) {
        internalButtonDispatcher.submitRequest(floor, elevatorCarController);
    };

}
