package services;

import entities.User;

public class AccountModule implements AccountService {
    private User user;

    public AccountModule(User user) {
        this.user = user;
    }

    @Override
    public void performOperation(String operation) {
        System.out.println(user.getName() + " выполняет операцию: " + operation);
    }
}
