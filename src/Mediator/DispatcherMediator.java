package Mediator;

import java.util.ArrayList;
import java.util.List;

public class DispatcherMediator implements Mediator {
    private List<Client> clients = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();

    @Override
    public void registerClient(Client client) {
        clients.add(client);
        System.out.println("Client registered: " + client.getName());
    }

    @Override
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver registered: " + driver.getName());
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof Client) {
            System.out.println("Mediator received event from Client: " + event);
            assignDriverToClient((Client) sender);
        } else if (sender instanceof Driver) {
            System.out.println("Mediator received event from Driver: " + event);
        }
    }

    private void assignDriverToClient(Client client) {
        if (!drivers.isEmpty()) {
            Driver closestDriver = drivers.get(0);  // For simplicity, select the first driver
            System.out.println("Assigning Driver " + closestDriver.getName() + " to Client " + client.getName());
            drivers.remove(closestDriver);  // Remove driver once assigned
        } else {
            System.out.println("No drivers available for client " + client.getName());
        }
    }
}

