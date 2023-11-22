package Turbocharger;

public class Honeywell extends Turbocharger{
    public Honeywell() {
        super.name = "Honeywell";
    }
    @Override
    public void behaviour(String name) {
        super.behaviour(name);
        System.out.println("Turbocharger has " + name + "Behavior");
    }
}