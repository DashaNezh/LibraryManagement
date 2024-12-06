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
    private Book book;

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
    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public  Date getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }
}
