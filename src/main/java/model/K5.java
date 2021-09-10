package model;

public class K5 extends Car {
    private static final String CAR_NAME = "K5";
    private static final Integer DISTANCE_PER_LITER = 13;

    public K5(Integer tripDistance) {
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
