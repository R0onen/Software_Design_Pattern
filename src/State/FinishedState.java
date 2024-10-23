package State;

public class FinishedState implements State {
    @Override
    public void next(Order order) {
        System.out.println("The order is already completed.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new OnTheWayState());
        System.out.println("Returning to on the way state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order completed.");
    }
}
