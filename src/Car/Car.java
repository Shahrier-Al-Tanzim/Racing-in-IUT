package Car;
import Engine.*;
import Turbocharger.*;
public class Car {
    public String name;
    public Engine engine;
    public Turbocharger turbocharger;
    public Car(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return this.engine;
    }
    public Turbocharger getTurbocharger() {
        return this.turbocharger;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTurbocharger(Turbocharger turbocharger) {
        this.turbocharger = turbocharger;
    }

    public String getName() {return this.name;}
    public void start() {
        System.out.println("Started");
    }
    public void stop() {
        System.out.println("Stopped");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }


    public void getCarInfo() {
        System.out.println("Car name :" + name);
        System.out.println("Engine :" + engine.name);
        System.out.println("Turbocharger :" + turbocharger.name);
    }
}
