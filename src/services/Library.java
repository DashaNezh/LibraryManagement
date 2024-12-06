package services;

import entities.Book;
import entities.User;
import entities.Loan;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;

    private List<Book> books;
    private List<User> users;
    private List<Loan> loans;

    private Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public List<Book> searchBooks(String query) {
        // Пример поиска
        return books.stream().filter(book -> book.getTitle().contains(query)).toList();
    }
}
