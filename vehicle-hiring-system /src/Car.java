package src;

public class Car extends Vehicle {

    public Car(String id, String plate, double dailyFee) {
        super(id, plate, dailyFee);
    }

    @Override
    public void load(double amount) throws OverWeightException {
        throw new OverWeightException("cars cannot carry load");
    }
}