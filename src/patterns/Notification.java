package patterns;

import entities.User;
import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<User> subscribers = new ArrayList<>();

    public void subscribe(User user) {
        subscribers.add(user);
    }

    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    public void notifyUsers(String message) {
        for (User user : subscribers) {
            user.receiveNotification(message);
        }
    }
}
