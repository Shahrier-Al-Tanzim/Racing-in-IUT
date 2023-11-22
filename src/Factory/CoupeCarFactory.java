package Factory;

import Car.Car;

import java.util.Scanner;
import Car.*;
public class CoupeCarFactory extends CarFactory{
    @Override
    public Car createCar(String carType) {
        if ("ToyotaGR86".equals(carType)) {
            return new ToyotaGR86();
        } else if ("SubaruBRZ".equals(carType)) {
            return new SubaruBRZ();
        } else {
            return null;
        }
    }
}