package MVP;

import java.util.Scanner;

public class LoginViewImpl implements LoginView {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void showLoginSuccess(String message) {
        System.out.println("Success: " + message);
    }

    @Override
    public void showLoginError(String message) {
        System.out.println("Error: " + message);
    }

    @Override
    public String getUsernameInput() {
        System.out.print("Enter username: ");
        return scanner.nextLine();
    }

    @Override
    public String getPasswordInput() {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }
}

