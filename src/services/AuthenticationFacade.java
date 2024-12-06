package services;

import entities.User;

public class AuthenticationFacade {
    private AuthenticationSubsystem authenticationSubsystem;

    public AuthenticationFacade() {
        this.authenticationSubsystem = new AuthenticationSubsystem();
    }

    public boolean login(String username, String password) {
        if (authenticationSubsystem.authenticate(username, password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public User getUser(String username) {
        return authenticationSubsystem.getUser(username);
    }
}
