package Engine;

import Car.Behavior;

public abstract class Engine implements Behavior {
    public String name;

    @Override
    public void behaviour(String name) {
        this.name = name;
    }

}
