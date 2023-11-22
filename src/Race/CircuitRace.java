package Race;

import Car.*;
import NOS.NOS;
import Track.*;

public class CircuitRace extends Race{
    public CircuitRace(Car car, Track track) {
        super(car, track);
        this.raceType = "Circuit";
    }
    @Override
    public void raceLogic(){
        for(int j = 1; j <= 3; j++) {
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
                System.out.println("Lap [" + j + "] - " + per + "% of this lap covered");
            }
            System.out.println("Lap " + j + " completed");
        }
    }
}
