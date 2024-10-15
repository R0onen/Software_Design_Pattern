package Chain_Of_Responsibility;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        Handler carAvailabilityHandler = new CarAvailabilityHandler();
        Handler balanceVerificationHandler = new BalanceVerificationHandler();
        Handler locationAssessmentHandler = new LocationAssessmentHandler();

        // Set up the chain
        carAvailabilityHandler.setNextHandler(balanceVerificationHandler);
        balanceVerificationHandler.setNextHandler(locationAssessmentHandler);

        // Create a client request
        ClientRequest request = new ClientRequest(true, 100.0, "Downtown");

        // Start the request processing
        carAvailabilityHandler.handleRequest(request);
    }
}
