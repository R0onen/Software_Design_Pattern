package Mediator;

public interface Mediator {
    void registerClient(Client client);
    void registerDriver(Driver driver);
    void notify(Object sender, String event);
}

