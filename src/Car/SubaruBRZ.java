package Car;

public class SubaruBRZ extends Car {
    public SubaruBRZ() {
        super("SubaruBRZ");
    }

    @Override
    public void start() {
        System.out.println("Started SubaruBRZ");
    }

    @Override
    public void stop() {
        System.out.println("Stopped SubaruBRZ");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating SubaruBRZ");
    }
}
