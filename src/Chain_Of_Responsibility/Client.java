package Chain_Of_Responsibility;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        Handler carAvailabilityHandler = new CarAvailabilityHandler();
        Handler balanceVerificationHandler = new BalanceVerificationHandler();
        Handler locationAssessmentHandler = new LocationAssessmentHandler();

        carAvailabilityHandler.setNextHandler(balanceVerificationHandler);
        balanceVerificationHandler.setNextHandler(locationAssessmentHandler);

        ClientRequest request = new ClientRequest(true, 100.0, "Downtown");

        carAvailabilityHandler.handleRequest(request);
    }
}
