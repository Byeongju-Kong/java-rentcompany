package model;

public class Avante extends Car {
    private static final String CAR_NAME = "Avante";
    private static final Integer DISTANCE_PER_LITER = 15;

    public Avante(Integer tripDistance) {
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
