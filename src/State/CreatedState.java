package State;

import Observer.Order;

public class CreatedState implements  State{
    @Override
    public void next(Order order) {
        order.setState(new ConfirmedState());
        System.out.println("Confirmed");
    }
    @Override
    public void prev(Order order) {
        System.out.println("The order is in initial state");
    }
    @Override
    public void printStatus(){
        System.out.println("Order created");
    }
}
