package Iterator;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // List of available drivers
        List<Driver> availableDrivers = Arrays.asList(
                new Driver("Alice", 5.0),
                new Driver("Bob", 3.0),
                new Driver("Charlie", 7.5),
                new Driver("Dave", 2.0)
        );

        // Create the driver list and iterator
        DriverCollection driverList = new DriverList(availableDrivers);
        DriverIterator iterator = driverList.createIterator();

        // Assign the closest driver
        if (iterator.hasNext()) {
            Driver closestDriver = iterator.next();
            System.out.println("Closest driver assigned: " + closestDriver.getName() +
                    ", Distance: " + closestDriver.getDistanceFromClient() + " km");
        }
    }
}
