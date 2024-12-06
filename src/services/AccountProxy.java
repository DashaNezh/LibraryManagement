package services;

import entities.Librarian;
import entities.User;

public class AccountProxy implements AccountService {
    private AccountModule accountModule;
    private User user;

    public AccountProxy(User user) {
        this.user = user;
        this.accountModule = new AccountModule(user);
    }

    @Override
    public void performOperation(String operation) {
        if ("manageBooks".equals(operation) && !(user instanceof Librarian)) {
            System.out.println("Access denied!");
        } else {
            accountModule.performOperation(operation);
        }
    }
}
