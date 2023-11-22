package NOS;

import Car.Car;
import NOS.NOS;

public class Sema extends NOS {
    public Sema(Car car) {
        super(car);
        this.nos = "Sema NOS";
    }
}
