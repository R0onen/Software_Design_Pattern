package Strategy;

public class DistanceBasedPricing implements PricingStrategy {
    private double pricePerKm;

    public DistanceBasedPricing(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * pricePerKm;
    }
}

