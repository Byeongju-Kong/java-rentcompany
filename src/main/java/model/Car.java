package model;

public abstract class Car {
    protected final double tripDistance;

    protected Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
