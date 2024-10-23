package Strategy;

public class FixedPricePricing implements PricingStrategy {
    private double fixedPrice;

    public FixedPricePricing(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateCost(double value) {
        return fixedPrice;
    }
}

