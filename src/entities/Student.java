package entities;

public class Student extends User {
    public Student(String name, String email) {
        super(name, email);
    }

    @Override
    public int getLoanLimit() {
        return 5;
    }
}
