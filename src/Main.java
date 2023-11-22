import Factory.*;
import Player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = Player.getInstance();
        player.chooseName();
        System.out.print("Which type of car - Coupe or Roadster : ");
        Scanner scanner = new Scanner(System.in);
        CarFactory carFactory = CarFactoryFetcher.getCarFactory(scanner.nextLine());
        player.chooseCar(carFactory);
        System.out.print("Change Engine at runtime  (v6/v8/v12) : ");
        player.getCar().getEngine().behaviour(scanner.nextLine());
        System.out.print("Change Turbocharger at runtime (Alpine/Cummins/Honeywell) : ");
        player.getCar().getTurbocharger().behaviour(scanner.nextLine());
        player.getCar().getCarInfo();
        player.chooseRaceType();
        System.out.print("Enter Location(USA/Japan/Germany): ");
        player.setTrack(TrackFactory.createTrack(scanner.nextLine(), player.getRaceType()));

        player.startRace();
    }
}