package Template_Method;

public class PremiumTaxiOrder extends OrderProcess {

    @Override
    protected void checkAvailability() {
        System.out.println("Checking premium taxi availability...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for premium taxi with additional fees...");
    }
}

