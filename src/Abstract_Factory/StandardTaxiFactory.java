package Abstract_Factory;

public class StandardTaxiFactory extends Factory {
    @Override
    public Taxi createTaxi(Driver driver, String license) {
        return new StandardTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) { return new StandardDriver(driverName); }
}

