package Race;

import Car.Car;
import Track.Track;
import NOS.*;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import Factory.*;
public abstract class Race {
    Scanner scanner = new Scanner(System.in);
    protected Car car;
    protected Track track;

    protected String raceType;

    public Race(Car car, Track track) {
        this.car = car;
        this.track = track;

    }
    public final String race(){
        startCar(car);
        startLine(track);
        raceLogic();
        finishLine(track);
        stopCar(car);
        return lapTime();
    }

    public abstract void raceLogic ();
    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        System.out.println("Reached the "+ track.getType()+ " starting line of " + track.getName());
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
    }

    protected NOS pitStop(Car car) {
        System.out.println("Pit stop: Adding NOS to the car");
        System.out.println("Which NOS do you want to use (Resonac/Sema)");
        String type = scanner.nextLine();
        return NOSFactory.createNOS(type, car);
    }

    protected boolean applyNOS() {
        System.out.println("Do you want to use NOS to your car? (Y/N)");
        String flag = scanner.nextLine();
        return flag.equalsIgnoreCase("Y");
//        if(flag.equalsIgnoreCase("Y"))
//            return true;
//        else
//            return false;

    }
    protected void finishLine(Track track) {
        System.out.println("Crossed the "+track.getType()+" finish line of " + track.getName());
    }

    protected void stopCar(Car car) {
        car.stop();
    }

    protected String lapTime() {
        Random rand = new Random();
        int totalSeconds = rand.nextInt(10 * 60);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        String formattedTime = sdf.format(minutes * 60 * 1000 + seconds * 1000);
        System.out.println("Lap Time: " + formattedTime);
        return formattedTime;
    }
}
