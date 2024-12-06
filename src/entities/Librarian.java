package entities;

public class Librarian extends User {
    public Librarian(String name, String email) {
        super(name, email);
    }

    @Override
    public int getLoanLimit() {
        // Например, у библиотекаря может быть неограниченное количество книг
        return Integer.MAX_VALUE;  // Или любое другое значение
    }
}
