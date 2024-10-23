package Strategy;

public class TimeBasedPricing implements PricingStrategy {
    private double pricePerMinute;

    public TimeBasedPricing(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateCost(double timeInMinutes) {
        return timeInMinutes * pricePerMinute;
    }
}

