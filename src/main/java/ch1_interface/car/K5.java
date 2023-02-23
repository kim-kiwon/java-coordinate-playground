package ch1_interface.car;

public class K5 implements Car {
    private int tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return 13;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return "K5";
    }

    @Override
    public String toString() {
        return getName() + " : " + (int) getChargeQuantity() + "리터";
    }
}
