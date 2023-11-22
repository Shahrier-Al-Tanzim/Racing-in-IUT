package Turbocharger;

import Car.Behavior;

public class Turbocharger implements Behavior {
    public String name;

    @Override
    public void behaviour(String name) {
        this.name = name;
    }
}
