package Mediator;

public class Driver {
    private String name;
    private Mediator mediator;

    public Driver(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.registerDriver(this);
    }

    public String getName() {
        return name;
    }

    public void notifyAvailability() {
        System.out.println("Driver " + name + " is available.");
        mediator.notify(this, "available");
    }
}

