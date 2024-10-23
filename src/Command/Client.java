package Command;

public class Client {
    public static void main(String[] args) {
        // Create a receiver (TaxiOrder)
        TaxiOrder taxiOrder = new TaxiOrder();

        Command createOrder = new CreateOrderCommand(taxiOrder, "Central Park");
        Command cancelOrder = new CancelOrderCommand(taxiOrder);
        Command changeDestination = new ChangeDestinationCommand(taxiOrder, "Times Square");

        createOrder
    }
}
