package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

public class ElevatorCar {
    int lift_id;
    int currFloor;
    int nextFloorStoppage;
    Direction movingDirection;
    Door door;

    public ElevatorCar(int id) {
        this.lift_id = id;
        this.currFloor = 0;
        this.nextFloorStoppage = 0;
        movingDirection = Direction.IDOL;
        door = new Door();
    }

    public void move(int destinationFloor) {
        this.nextFloorStoppage = destinationFloor;

        if(nextFloorStoppage == currFloor) {
            door.openGate(lift_id);
            return;
        }

        door.closeGate(lift_id);
        showDisplay();
        if(nextFloorStoppage > currFloor) {
            this.movingDirection = Direction.UP;
            for(int i=currFloor+1;i<=nextFloorStoppage+1;i++) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {}
                setCurrentFloor(i);
                showDisplay();
            }
        } else {
            this.movingDirection = Direction.DOWN;
            for(int i=currFloor-1;i>=nextFloorStoppage+1;i--) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {}
                setCurrentFloor(i);
                showDisplay();
            }
        }
        door.openGate(lift_id);
    };

    void showDisplay() {
        System.out.printf("Elevator:%s, Current_Floor:%s, Door_State:%S, Going:%s%n", lift_id, currFloor, door.getState(), movingDirection);
    }
     void setCurrentFloor(int f) {
        this.currFloor = f;
     }

}
