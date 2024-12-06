package patterns;

import entities.Book;

public class MetadataDecorator extends Book {
    private Book book;
    private String metadata;

    public MetadataDecorator(Book book, String metadata) {
        super(book.getTitle(), book.getAuthor());
        this.book = book;
        this.metadata = metadata;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + " | Metadata: " + metadata;
    }
}
