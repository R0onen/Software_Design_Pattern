package Abstract_Factory;

public class PremiumTaxiFactory extends Factory {
    @Override
    public Taxi createTaxi(Driver driver, String license) {
        return new PremiumTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new PremiumDriver(driverName);
    }
}

