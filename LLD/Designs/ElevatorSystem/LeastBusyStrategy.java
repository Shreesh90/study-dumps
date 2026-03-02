package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

import java.util.List;

public class LeastBusyStrategy implements ElevatorSelectionStrategy {

    @Override
    public ElevatorCarController selectElevatorController(List<ElevatorCarController> elevatorCarControllerList, int destFloor, Direction direction) {
        ElevatorCarController best = null;
        int minLoad = Integer.MAX_VALUE;

        for (ElevatorCarController controller : elevatorCarControllerList) {
            int load = controller.up_minHeap.size() +
                    controller.down_maxHeap.size();

            if (load < minLoad) {
                minLoad = load;
                best = controller;
            }
        }
        return best;

    }
}
