package second_task.stream_42.transport;

import java.util.ArrayList;
import java.util.List;

public class TransportSystem {
    private final List<Vehicle> vehicles;

    public TransportSystem() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("-----------------");
            vehicle.move();
            vehicle.showProperties();
        }
    }
}
