package Race;

import Car.Car;
import Track.Track;
import NOS.*;
public class SprintRace extends Race{
    public SprintRace(Car car, Track track) {
        super(car, track);
        this.raceType = "Sprint";
    }
    @Override
    public void raceLogic(){
        for(int i = 1; i <= 4; i++) {
            if(applyNOS()) {
                NOS nos = pitStop(car);
                nos.start();
                nos.accelerate();
                nos.start();
                System.out.println("CAR GOING FAAAAAAST ");
                accelerateCar(car);
            }
            System.out.println("Car is running");
            System.out.println("==> ==> ==>");
            double per = (i) * 100 / 4;
            System.out.println(per + "% of Sprint covered");
        }
    }
}
