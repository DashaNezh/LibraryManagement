package entities;

public abstract class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract int getLoanLimit();

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void receiveNotification(String notification) {
        System.out.println("Notification for " + name + ": " + notification);
    }
}
