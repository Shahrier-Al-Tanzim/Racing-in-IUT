package Factory;

public class CarFactoryFetcher {
    public static CarFactory getCarFactory(String carType){
        if (carType.equalsIgnoreCase("Coupe")) {
            System.out.println("Getting Coupe Car Factory");
            System.out.print("Choose ToyotaGR86 or SubaruBRZ: ");
            return new CoupeCarFactory();
        } else if (carType.equalsIgnoreCase("Roadster")) {
            System.out.println("Getting Roadster Car Factory");
            System.out.print("Choose Ferrari812 or PorsheBoxer: ");
            return new RoadsterCarFactory();
        } else {
            return null;
        }
    }
}