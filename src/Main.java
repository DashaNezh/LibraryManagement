import services.*;
import entities.*;
import patterns.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем библиотеку
        Library library = Library.getInstance();

        // Добавляем книги в библиотеку
        library.addBook(new EBook("Программирование на Java", "Джон Доу", 5.5, "PDF"));
        library.addBook(new PrintedBook("Структуры данных", "Джейн Смит", "Полка A"));

        // Добавляем пользователей
        User student = new Student("Алиса", "alice@example.com");
        User professor = new Professor("Боб", "bob@example.com");
        User librarian = new Librarian("Чарли", "charlie@example.com");

        library.registerUser(student);
        library.registerUser(professor);
        library.registerUser(librarian);

        // Осуществляем поиск
        Catalog catalog = new Catalog(library.getBooks());
        SearchCriteria searchByTitle = new TitleSearchCriteria("Программирование на Java");
        SearchCriteria searchByAuthor = new AuthorSearchCriteria("Джон Доу");

        // Поиск по названию
        List<Book> searchResultsByTitle = catalog.search(searchByTitle);
        System.out.println("Найдено книг по названию: " + searchResultsByTitle.size());

        // Поиск по автору
        List<Book> searchResultsByAuthor = catalog.search(searchByAuthor);
        System.out.println("Найдено книг по автору: " + searchResultsByAuthor.size());

        // Система уведомлений (Observer)
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.subscribe(student);
        notificationSystem.subscribe(professor);

        notificationSystem.notifyObservers("Новая книга доступна: Структуры данных");

        // Осуществляем выдачу книг
        Loan studentLoan = new Loan(new BookCopy(library.getBooks().get(0), 1), student);
        Loan professorLoan = new Loan(new BookCopy(library.getBooks().get(1), 2), professor);

        // Выдача книг
        studentLoan.setState(new IssuedState());
        professorLoan.setState(new IssuedState());

        // Формируем отчет по популярности
        List<Loan> loans = new ArrayList<>();
        loans.add(studentLoan);
        loans.add(professorLoan);

        Report report = new Report(new PopularityReportStrategy());
        report.generate(loans);

        // Добавление истории действий (Memento)
        ActionHistory actionHistory = new ActionHistory();
        actionHistory.addState(studentLoan.saveState());
        actionHistory.addState(professorLoan.saveState());

        // Оплата штрафов через онлайн систему (Adapter)
        PaymentSystem paymentSystem = new OnlinePaymentSystem();
        paymentSystem.pay(15.0);

        // Рейтинг книги (Composite)
        RatingComponent rating = new BookRating("Программирование на Java", 5);
        Review review = new Review("Отличная книга по Java!");
        review.add(rating);
        review.display();

        // Пользователь Librarian может управлять книгами и ограничениями
        Librarian librarianUser = (Librarian) librarian;
        librarianUser.manageBooks(library);

        // Пример использования Template Method для определения лимита на книги
        System.out.println("Лимит на книги для студента: " + student.getLoanLimit());
        System.out.println("Лимит на книги для профессора: " + professor.getLoanLimit());
        System.out.println("Лимит на книги для библиотекаря: " + librarianUser.getLoanLimit());
    }
}
