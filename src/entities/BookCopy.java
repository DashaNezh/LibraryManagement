package entities;

public class BookCopy implements Cloneable {
    private Book book;
    private String id;

    public BookCopy(Book book, String id) {
        this.book = book;
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public String getId() {
        return id;
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
