package Designs.ElevatorSystem;

import Designs.ElevatorSystem.Enums.Direction;

import java.util.concurrent.PriorityBlockingQueue;

public class ElevatorCarController implements Runnable {
    ElevatorCar elevatorCar;

    PriorityBlockingQueue<Integer> up_minHeap;
    PriorityBlockingQueue<Integer> down_maxHeap;

    private final Object monitor = new Object();

    public ElevatorCarController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        up_minHeap = new PriorityBlockingQueue<>();
        down_maxHeap = new PriorityBlockingQueue<>(10, (a, b) -> b - a);
    }

    void submitNewRequest(int floor) {
        enqueueRequest(floor);
    };

    private void enqueueRequest(int destinationFloor) {
        System.out.println("Request details-> destinationFloor: " + destinationFloor + " accepted by elevator:" + elevatorCar.lift_id);

        if (destinationFloor == elevatorCar.nextFloorStoppage){
            return;
        }
        if (destinationFloor >= elevatorCar.nextFloorStoppage) {
            if (!up_minHeap.contains(destinationFloor)) {
                up_minHeap.offer(destinationFloor);
            }
        } else {
            if (!down_maxHeap.contains(destinationFloor)) {
                down_maxHeap.offer(destinationFloor);
            }
        }

        synchronized (monitor) {
            monitor.notify();   // wake elevator thread
        }
    }


    @Override
    public void run() {
        controlElevator();
    }

    public void controlElevator() {

        while (true) {

            //no request, go to sleep
            synchronized (monitor) {
                while (up_minHeap.isEmpty() && down_maxHeap.isEmpty()) {
                    try {
                        System.out.println("elevator:" + elevatorCar.lift_id + " is IDLE");
                        elevatorCar.movingDirection = Direction.IDOL;
                        monitor.wait(); // sleep until request arrives
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }


            while (!up_minHeap.isEmpty()) {
                int floor = up_minHeap.poll();
                System.out.println("Serving floor: " + floor + " by elevator:" + elevatorCar.lift_id + " currentFloor: " + elevatorCar.currFloor);
                elevatorCar.move(floor);
            }


            while (!down_maxHeap.isEmpty()) {
                int floor = down_maxHeap.poll();
                System.out.println("Serving floor: " + floor + " by elevator:" + elevatorCar.lift_id + " currentFloor: " + elevatorCar.currFloor);
                elevatorCar.move(floor);
            }
        }
    }



}
