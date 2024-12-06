package services;

import entities.User;

public class AuthenticationSubsystem {
    public boolean authenticate(String username, String password) {
        // Здесь будет код аутентификации, например, через базу данных
        System.out.println("Authenticating user: " + username);
        return username.equals("admin") && password.equals("password123");
    }

    public User getUser(String username) {
        // Возвращаем пользователя по имени (пример)
        if (username.equals("admin")) {
            return new Librarian("Admin", "admin@example.com");
        }
        return null;
    }
}
