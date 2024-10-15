package Chain_Of_Responsibility;

public class LocationAssessmentHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        System.out.println("Location is valid: " + request.getLocation());
    }
}

