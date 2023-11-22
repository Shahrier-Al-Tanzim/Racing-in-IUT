package Player;

import Car.*;
import Track.*;
import Factory.*;
import Race.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    private static Player instance;
    private Car selectedCar;
    private Track selectedTrack;
    private String raceType;

    private String name;

    private static List<String> finishTime= new ArrayList<String>();

    private Player() {
        selectedCar = null;
        selectedTrack = null;
        raceType = "";
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void chooseName() {
        System.out.print("Enter Player Name: ");
        name = scanner.nextLine();
        System.out.println("Current Player: " + getName());
    }

    public Car getCar() {
        return selectedCar;
    }
    public void chooseCar(CarFactory carFactory) {
        selectedCar = carFactory.createCar(scanner.nextLine());
        System.out.println(selectedCar.name);

        System.out.print("Enter Engine type for "+selectedCar.getName()+"(v6/v8/v12):");
        selectedCar.setEngine(EngineFactory.getEngine(scanner.nextLine()));

        System.out.print("Enter turbocharger type for "+selectedCar.getName()+"(Alpine/Cummins/Honeywell):");
        selectedCar.setTurbocharger(TurbochargerFactory.getTurbocharger(scanner.nextLine()));

        selectedCar.getCarInfo();
    }

    public Track getTrack() {
        return selectedTrack;
    }
    public String getRaceType(){
        return raceType;
    }
    public void setTrack(Track track) {
        this.selectedTrack = track;
    }

    public void chooseRaceType() {
        System.out.print("Enter Track Type(Circuit/Sprint): ");
        this.raceType = scanner.nextLine();
    }

    public void startRace() {
        selectedCar.getCarInfo();
        selectedTrack.trackInfo();
        System.out.println("Race Type: " + raceType);
        System.out.println("Starting the race...");
        Race race = RaceFactory.createRace(selectedCar, selectedTrack, raceType);
        String time = race.race();
    }
}
