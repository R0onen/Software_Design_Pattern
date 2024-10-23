package State;

public class OnTheWayState implements State {
    @Override
    public void next(Order order) {
        order.setState(new FinishedState());
        System.out.println("Order completed.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new ConfirmedState());
        System.out.println("Returning to confirmed state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Taxi is en route.");
    }
}

