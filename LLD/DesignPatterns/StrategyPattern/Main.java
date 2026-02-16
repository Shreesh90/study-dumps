package DesignPatterns.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.StrategyPattern.Vehicle.PublicTransport;
import DesignPatterns.StrategyPattern.Vehicle.OffroadVehicle;
import DesignPatterns.StrategyPattern.Vehicle.SportsVehicle;
import DesignPatterns.StrategyPattern.Vehicle.Vehicle;



public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new SportsVehicle());
        vehicles.add(new OffroadVehicle());
        vehicles.add(new PublicTransport());

        for(Vehicle vehicle: vehicles) {
            vehicle.drive();
        }
    }
}
