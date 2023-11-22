package Factory;

import Car.*;
import NOS.*;

public class NOSFactory {
    public static NOS createNOS(String nosType, Car car) {
        if (nosType.equalsIgnoreCase("Resonac")) {
            return new Resonac(car);
        } else if (nosType.equalsIgnoreCase("Sema")) {
            return new Sema(car);
        }
        return null;
    }
}
