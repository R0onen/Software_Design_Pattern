package Chain_Of_Responsibility;

public class BalanceVerificationHandler extends Handler {
    private static final double MIN_BALANCE = 50.0; // Minimum balance requirement
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.getClientBalance() >= MIN_BALANCE) {
            System.out.println("Client has sufficient balance.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

