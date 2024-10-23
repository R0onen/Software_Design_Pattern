package State;

public class ConfirmedState implements State {
    @Override
    public void next(Order order) {
        order.setState(new OnTheWayState());
        System.out.println("Taxi is on the way.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new CreatedState());
        System.out.println("Returning to created state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order confirmed.");
    }
}

