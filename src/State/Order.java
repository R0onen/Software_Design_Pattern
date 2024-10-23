package State;

public class Order {
    private State state;

    public Order() {
        state = new CreatedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
