package ch1_interface.car;

public class Avante implements Car {
    private int tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return 15;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return "Avante";
    }

    @Override
    public String toString() {
        return getName() + " : " + (int) getChargeQuantity() + "리터";
    }
}
