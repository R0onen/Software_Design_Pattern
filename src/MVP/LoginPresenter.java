package MVP;

public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void login() {
        String username = view.getUsernameInput();
        String password = view.getPasswordInput();

        User user = new User(username, password);
        if (user.isValid()) {
            view.showLoginSuccess("Login successful for user: " + username);
        } else {
            view.showLoginError("Invalid username or password.");
        }
    }
}

