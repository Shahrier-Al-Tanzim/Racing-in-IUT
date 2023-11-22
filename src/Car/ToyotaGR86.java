package Car;

public class ToyotaGR86 extends Car {
    public ToyotaGR86() {
        super("ToyotaGR86");
    }
    @Override
    public void start() {
        System.out.println("Started ToyotaGR86");
    }

    @Override
    public void stop() {
        System.out.println("Stopped ToyotaGR86");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating ToyotaGR86");
    }
}
