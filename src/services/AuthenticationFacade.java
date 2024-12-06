package services;

import entities.User;

public class AuthenticationFacade {
    private AuthenticationSubsystem authenticationSubsystem;

    public AuthenticationFacade() {
        this.authenticationSubsystem = new AuthenticationSubsystem();
    }

    public boolean login(String username, String password) {
        if (authenticationSubsystem.authenticate(username, password)) {
            System.out.println("Вход в систему прошел успешно!");
            return true;
        } else {
            System.out.println("Неверное имя пользователя или пароль.");
            return false;
        }
    }

    public User getUser(String username) {
        return authenticationSubsystem.getUser(username);
    }
}
