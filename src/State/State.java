package State;

import Observer.Order;

public interface State {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}
