package Factory;

import Car.*;

public class RoadsterCarFactory extends CarFactory {
    @Override
    public Car createCar(String carName) {
        if ("Ferrari812".equals(carName)) {
            return new Ferrari812();
        } else if ("PorsheBoxer".equals(carName)) {
            return new PorsheBoxer();
        } else {
            return null;
        }
    }
}