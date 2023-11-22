package Factory;

import Car.Car;
import Race.Race;
import Track.Track;
import Race.*;
public class RaceFactory {
    public static Race createRace(Car car, Track track, String raceType){
        if (raceType.equalsIgnoreCase("Sprint")) {
            return new SprintRace(car,track);
        } else if (raceType.equalsIgnoreCase("Circuit")) {
            return new CircuitRace(car,track);
        }
        return null;
    }
}
