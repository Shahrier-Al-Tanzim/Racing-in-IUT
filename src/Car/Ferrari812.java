package Car;

public class Ferrari812 extends Car {
    public Ferrari812() {
        super("Ferrari812");
    }
    @Override
    public void start() {
        System.out.println("Started Ferrari812");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Ferrari812");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Ferrari812");
    }
}
