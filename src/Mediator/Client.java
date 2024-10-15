package Mediator;

public class Client {
    private String name;
    private Mediator mediator;

    public Client(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void requestDriver() {
        System.out.println("Client " + name + " is requesting a driver.");
        mediator.notify(this, "requestDriver");
    }
}

