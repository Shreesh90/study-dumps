package Designs.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floors = new ArrayList<>();

    public Building(int total_floors, ExternalButtonDispatcher disp) {
        for(int i=1;i<=total_floors;i++) {
            floors.add(new Floor(i+1, disp));
        }
    }

    public Floor getFloor(int id) {
        return floors.get(id-1);
    }

}
