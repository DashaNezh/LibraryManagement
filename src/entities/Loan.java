package entities;

import patterns.IssuedState;
import patterns.LoanStateHandler;

import java.util.Date;

public class Loan {
    private Date loanDate;  // Дата выдачи книги
    private Date returnDate;  // Дата возврата книги
    private BookCopy bookCopy;
    private User user;
    private LoanStateHandler state;

    public Loan(BookCopy bookCopy, User user) {
        this.bookCopy = bookCopy;
        this.user = user;
        this.state = new IssuedState();  // Начальное состояние - книга выдана
    }

    // Устанавливаем новое состояние для книги
    public void setState(LoanStateHandler state) {
        this.state = state;
    }

    // Обработка состояния, например, выводим сообщения о текущем состоянии
    public void processState() {
        state.handle();
    }

    // Геттеры и сеттеры для работы с loan
    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public User getUser() {
        return user;
    }

    public LoanStateHandler getState() {
        return state;
    }

    public Book getBook() {
        return book;
    }
}
