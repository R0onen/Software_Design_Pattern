package Abstract_Factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new StandardTaxiFactory();
        Driver standardriver = factory.createDriver("Daniele");
        Taxi standardtaxi = factory.createTaxi(standardriver, "XYZ12345");
        standardtaxi.takePassenger("Yernur");

        factory = new PremiumTaxiFactory();
        Driver premiumdriver = factory.createDriver("Daniele");
        Taxi premiumtaxi  = factory.createTaxi(premiumdriver, "XYZ12345");
        premiumtaxi.takePassenger("Pasha");
    }
}
