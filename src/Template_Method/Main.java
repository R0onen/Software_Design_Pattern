package Template_Method;

public class Main {
    public static void main(String[] args) {
        OrderProcess standardOrder = new StandardTaxiOrder();
        System.out.println("Processing standard taxi order:");
        standardOrder.processOrder();

        OrderProcess premiumOrder = new PremiumTaxiOrder();
        System.out.println("\nProcessing premium taxi order:");
        premiumOrder.processOrder();
    }
}

