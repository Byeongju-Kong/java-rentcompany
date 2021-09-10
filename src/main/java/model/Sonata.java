package model;

public class Sonata extends Car {
    private static final String CAR_NAME = "Sonata";
    private static final Integer DISTANCE_PER_LITER = 10;

    public Sonata(Integer tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }
    @Override
    double getTripDistance(){
        return tripDistance;
    }
    @Override
    String getName(){
        return CAR_NAME;
    }
}
