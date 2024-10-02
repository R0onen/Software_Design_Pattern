package Abstract_Factory;

public abstract class Factory {
    public abstract Taxi createTaxi(Driver driver, String license);
    public abstract Driver createDriver(String driverName);
}
