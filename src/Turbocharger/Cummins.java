package Turbocharger;

public class Cummins extends Turbocharger{
    public Cummins() {
        super.name = "Cummins";
    }
    @Override
    public void behaviour(String name) {
        super.behaviour(name);
        System.out.println("Turbocharger has " + name + "Behavior");
    }
}