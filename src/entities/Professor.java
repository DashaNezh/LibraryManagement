package entities;

public class Professor extends User {
    public Professor(String name, String email) {
        super(name, email);
    }

    @Override
    public int getLoanLimit() {
        return 10;
    }
}
