package Command;

public class TaxiOrder {
    private String destination;
    private boolean isActive;

    public void createOrder(String destination) {
        this.destination = destination;
        this.isActive = true;
        System.out.println("Order created. Destination: " + destination);
    }

    public void cancelOrder() {
        if (isActive) {
            this.isActive = false;
            System.out.println("Order canceled.");
        } else {
            System.out.println("No active order to cancel.");
        }
    }

    public void changeDestination(String newDestination) {
        if (isActive) {
            this.destination = newDestination;
            System.out.println("Destination changed to: " + newDestination);
        } else {
            System.out.println("No active order to change the destination.");
        }
    }
}

