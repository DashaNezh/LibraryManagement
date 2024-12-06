import services.*;
import entities.*;
import patterns.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем библиотеку
        Library library = Library.getInstance();
        library.addBook(new EBook("Java Programming", "John Doe", 5.5, "PDF"));
        library.addBook(new PrintedBook("Data Structures", "Jane Smith", "Shelf A"));

        // Добавляем пользователей
        User student = new Student("Alice", "alice@example.com");
        User professor = new Professor("Bob", "bob@example.com");

        library.registerUser(student);
        library.registerUser(professor);

        // Осуществляем поиск
        Catalog catalog = new Catalog(library.getBooks());
        SearchCriteria searchCriteria = new TitleSearchCriteria("Java Programming");
        List<Book> searchResults = catalog.search(searchCriteria);
        System.out.println("Found books: " + searchResults.size());

        // Формируем отчет по популярности
        List<Loan> loans = new ArrayList<>();
        Report report = new Report(new PopularityReportStrategy());
        report.generate(loans);

        // Оплата штрафов через онлайн систему
        PaymentSystem paymentSystem = new OnlinePaymentSystem();
        paymentSystem.pay(15.0);

        // Рейтинг книги
        RatingComponent rating = new BookRating("Java Programming", 5);
        Review review = new Review("Great book on Java!");
        review.add(rating);
        review.display();
    }
}
