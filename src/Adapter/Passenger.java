package Adapter;

public class Passenger {
    private Driver driver;
    public Passenger() {}
    public Passenger(Driver driver) {
        this.driver = driver;
    }
    public Driver getDriver(Driver driver) {
        return driver;
    }
}
