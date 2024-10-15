package Mediator;

public class Dispatcher {
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveClientRequest(Client client) {
        System.out.println("Dispatcher received request from Client: " + client.getName());
        client.requestDriver();
    }
}

