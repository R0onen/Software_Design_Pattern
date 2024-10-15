package Command;

public class ChangeDestinationCommand implements Command {
    private TaxiOrder taxiOrder;
    private String newDestination;

    public ChangeDestinationCommand(TaxiOrder taxiOrder, String newDestination) {
        this.taxiOrder = taxiOrder;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        taxiOrder.changeDestination(newDestination);
    }
}

