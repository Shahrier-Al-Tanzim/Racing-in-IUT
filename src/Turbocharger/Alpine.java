package Turbocharger;

public class Alpine extends Turbocharger{
    public Alpine() {
        super.name = "Alpine";
    }
    @Override
    public void behaviour(String name) {
        super.behaviour(name);
        System.out.println("Turbocharger has " + name + "Behavior");
    }
}