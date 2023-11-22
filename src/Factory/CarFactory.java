package Factory;

import Car.Car;

public abstract class CarFactory {
    public abstract Car createCar(String carType);
}
