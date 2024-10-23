package Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        order.registerObserver(client1);
        order.registerObserver(client2);

        order.SetStatus("Taxi is on the way");
        order.SetStatus("Taxi has arrived");

        order.removeObserver(client1);

        order.SetStatus("Order completed");
    }
}
