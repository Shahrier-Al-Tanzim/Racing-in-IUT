package Factory;
import Car.*;
public abstract  class AbstractCarFactory {
    abstract Car createCar(String carType);
}
