package MVP;

public interface LoginView {
    void showLoginSuccess(String message);
    void showLoginError(String message);
    String getUsernameInput();
    String getPasswordInput();
}

