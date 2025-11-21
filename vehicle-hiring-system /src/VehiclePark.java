package src;

import java.util.ArrayList;

public class VehiclePark {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void listVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }

    public double rentVehicle(String id, int days) throws VehicleUnavailableException {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                return v.rent(days);
            }
        }
        throw new VehicleUnavailableException("vehicle not found");
    }

    public void dropVehicle(String id) throws VehicleUnavailableException {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                v.drop();
                return;
            }
        }
        throw new VehicleUnavailableException("vehicle not found");
    }

    public void loadVehicle(String id, double amount) throws Exception {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                v.load(amount);
                return;
            }
        }
        throw new VehicleUnavailableException("vehicle not found");
    }
}