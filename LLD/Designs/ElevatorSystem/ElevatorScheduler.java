package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

import java.util.List;

public class ElevatorScheduler {
    List<ElevatorCarController> elevatorCarControllerList;
    ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ElevatorScheduler(List<ElevatorCarController> elevatorCarControllerList,
                             ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorCarControllerList = elevatorCarControllerList;
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;

    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public ElevatorCarController getElevatorCarControllerBasedOnStrategy(int floor, Direction direction) {
        return elevatorSelectionStrategy.selectElevatorController(elevatorCarControllerList, floor, direction);
    }

}
