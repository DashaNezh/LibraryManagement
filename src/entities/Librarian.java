package entities;

import services.Library;

public class Librarian extends User {
    public Librarian(String name, String email) {
        super(name, email);
    }

    @Override
    public int getLoanLimit() {
        // Например, у библиотекаря может быть неограниченное количество книг
        return Integer.MAX_VALUE;  // Или любое другое значение
    }

    public void manageBooks(Library library) {
        // Пример простого управления: добавление книги в библиотеку
        System.out.println("Управление книгами в библиотеке.");
        library.addBook(new PrintedBook("Новая книга", "Автор", "Полка В"));
    }
}
