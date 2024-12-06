package entities;

public class BookCopy implements Cloneable {
    private Book book;
    private int id;

    public BookCopy(Book book, int id) {
        this.book = book;
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public BookCopy clone() {
        try {
            return (BookCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
