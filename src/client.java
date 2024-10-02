

public static void client(String[] args) {
    Passenger passenger = new Passenger();

    DriverManager driverManager = DriverManager.getInstance();

    String driver = driverManager.findNearestDriver("Location A");

    passenger.assignTaxi(driver);

    System.out.println(passenger.getTaxi());
}
