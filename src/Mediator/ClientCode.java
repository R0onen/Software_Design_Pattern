package Mediator;

public class ClientCode {
    public static void main(String[] args) {
        // Create mediator
        DispatcherMediator mediator = new DispatcherMediator();

        Client client1 = new Client("Alice", mediator);
        Client client2 = new Client("Bob", mediator);
        Driver driver1 = new Driver("Charlie", mediator);
        Driver driver2 = new Driver("Dave", mediator);

        Dispatcher dispatcher = new Dispatcher(mediator);

        dispatcher.receiveClientRequest(client1);  // Alice requests a driver
        dispatcher.receiveClientRequest(client2);  // Bob requests a driver
    }
}
