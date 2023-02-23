package ch1_interface;

import ch1_interface.car.Car;
import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();

        for (Car car : cars) {
            sb.append(car + "\n");
        }

        return sb.toString();
    }
}
