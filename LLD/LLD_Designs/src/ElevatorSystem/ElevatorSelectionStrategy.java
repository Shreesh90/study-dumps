package ElevatorSystem;

import ElevatorSystem.Enums.Direction;

import java.util.List;

public interface ElevatorSelectionStrategy {

    ElevatorCarController selectElevatorController(List<ElevatorCarController> elevatorCarControllerList, int destFloor, Direction direction) ;
}
