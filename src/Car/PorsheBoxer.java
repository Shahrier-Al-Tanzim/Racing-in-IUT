package Car;

public class PorsheBoxer extends Car {
    public PorsheBoxer() {
        super("PorsheBoxer");
    }
    @Override
    public void start() {
        System.out.println("Started PorsheBoxer");
    }

    @Override
    public void stop() {
        System.out.println("Stopped PorsheBoxer");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating PorsheBoxer");
    }
}
