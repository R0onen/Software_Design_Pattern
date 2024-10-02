package Singleton;

public class Client {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();

        DriverManager driverManager = DriverManager.getInstance();

        String driver = driverManager.findNearestDriver("Location A");

        passenger.assignTaxi(driver);

        System.out.println(passenger.getTaxi());
    }
}
