package Command;

public class CreateOrderCommand implements Command {
    private TaxiOrder taxiOrder;
    private String destination;

    public CreateOrderCommand(TaxiOrder taxiOrder, String destination) {
        this.taxiOrder = taxiOrder;
        this.destination = destination;
    }

    @Override
    public void execute() {
        taxiOrder.createOrder(destination);
    }
}

