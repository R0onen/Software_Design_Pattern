package Template_Method;

public class StandardTaxiOrder extends OrderProcess {

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for standard taxi based on distance...");
    }
}

