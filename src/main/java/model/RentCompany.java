package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String DELIMITER = " : ";
    private static final String CHARGE_UNIT = "리터";
    private final List<Car> rentCars;

    private RentCompany() {
        rentCars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        rentCars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        IntStream.range(0, rentCars.size())
                .forEach(index -> report.append(rentCars.get(index).getName())
                        .append(DELIMITER)
                        .append((int) rentCars.get(index).getChargeQuantity())
                        .append(CHARGE_UNIT)
                        .append(NEWLINE));
        return report.toString();
    }
}
