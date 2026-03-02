package Designs.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            ElevatorCar lift1 = new ElevatorCar(1);
            ElevatorCarController lift1Controller = new ElevatorCarController(lift1);

            ElevatorCar lift2 = new ElevatorCar(2);
            ElevatorCarController lift2Controller = new ElevatorCarController(lift2);

            InternalButtonDispatcher internalDispatcher = new InternalButtonDispatcher();
            InternalButton internalButton_for_elevator1 = new InternalButton(internalDispatcher, lift1Controller);
            InternalButton internalButton_for_elevator2 = new InternalButton(internalDispatcher, lift2Controller);


            List<ElevatorCarController> elevatorControllerList = new ArrayList<>();
            elevatorControllerList.add(lift1Controller);
            elevatorControllerList.add(lift2Controller);

            ElevatorScheduler scheduler = new ElevatorScheduler(elevatorControllerList, new LeastBusyStrategy());

            ExternalButtonDispatcher ext_dispatcher = new ExternalButtonDispatcher(scheduler);
            Building building = new Building(10, ext_dispatcher);


            new Thread(lift1Controller, "Elevator-1").start();
            new Thread(lift2Controller, "Elevator-2").start();

            building.getFloor(3).pressUpButton();
            Thread.sleep(5);

            building.getFloor(5).pressDownButton();
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(4); // user inside elevator 1 presses floor 4
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(5); // user inside elevator 1 presses floor 5
            Thread.sleep(5);

            building.getFloor(1).pressDownButton();
            Thread.sleep(5);

            building.getFloor(2).pressUpButton();
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(2);



        } catch (Exception e) {

        }


    }
}
