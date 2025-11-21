package src;

public abstract class Vehicle {

    private String id;
    private String plate;
    private double dailyFee;
    private boolean rented;

    public Vehicle(String id, String plate, double dailyFee) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("id cannot be empty");
        if (plate == null || plate.isEmpty()) throw new IllegalArgumentException("plate cannot be empty");
        if (dailyFee < 0) throw new IllegalArgumentException("dailyFee cannot be negative");

        this.id = id;
        this.plate = plate;
        this.dailyFee = dailyFee;
        this.rented = false;
    }

    public String getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        if (dailyFee < 0) throw new IllegalArgumentException("dailyFee cannot be negative");
        this.dailyFee = dailyFee;
    }

    public boolean isRented() {
        return rented;
    }

    public double getTotalFee(int numberOfDays) {
        if (numberOfDays <= 0) throw new IllegalArgumentException("days must be positive");
        return numberOfDays * dailyFee;
    }

    public double rent(int numberOfDays) throws VehicleUnavailableException {
        if (rented) throw new VehicleUnavailableException("vehicle already rented");
        double total = getTotalFee(numberOfDays);
        rented = true;
        return total;
    }

    public void drop() {
        rented = false;
    }

    public abstract void load(double amount) throws OverWeightException;

    @Override
    public String toString() {
        return "Vehicle{id='" + id + "', plate='" + plate + "', dailyFee=" + dailyFee + ", rented=" + rented + "}";
    }
}