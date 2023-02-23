package ch1_interface.car;

public class Sonata implements Car {
    private int tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return 10;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return "Sonata";
    }

    @Override
    public String toString() {
        return getName() + " : " + (int) getChargeQuantity() + "리터";
    }
}
