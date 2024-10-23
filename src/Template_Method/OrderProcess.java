package Template_Method;

public abstract class OrderProcess {

    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected void checkAvailability() {
        System.out.println("Checking taxi availability...");
    }

    protected abstract void calculateCost();

    protected void confirmOrder() {
        System.out.println("Confirming order...");
    }
}

