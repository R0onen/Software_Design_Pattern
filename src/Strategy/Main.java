package Strategy;

public class Main {
    public static void main(String[] args) {
        Trip trip = new Trip();

        trip.setPricingStrategy(new DistanceBasedPricing(2.0));
        System.out.println("Cost by distance (10 km): $" + trip.calculateCost(10));

        trip.setPricingStrategy(new TimeBasedPricing(0.5));
        System.out.println("Cost by time (30 minutes): $" + trip.calculateCost(30));

        trip.setPricingStrategy(new FixedPricePricing(20.0));
        System.out.println("Fixed price: $" + trip.calculateCost(0));
    }
}

