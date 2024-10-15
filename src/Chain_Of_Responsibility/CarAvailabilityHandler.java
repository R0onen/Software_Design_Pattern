package Chain_Of_Responsibility;

public class CarAvailabilityHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.isCarAvailable()) {
            System.out.println("Car is available.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}
