package src;

public class Truck extends Vehicle {

    private double maxLoad;
    private double currentLoad;

    public Truck(String id, String plate, double dailyFee, double maxLoad) {
        super(id, plate, dailyFee);
        if (maxLoad < 0) throw new IllegalArgumentException("maxLoad cannot be negative");
        this.maxLoad = maxLoad;
        this.currentLoad = 0;
    }

    @Override
    public void load(double amount) throws OverWeightException {
        if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
        if (currentLoad + amount > maxLoad) throw new OverWeightException("exceeds max load");
        currentLoad += amount;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }
}