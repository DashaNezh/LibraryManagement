package patterns;

import entities.Book;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorSearchCriteria implements SearchCriteria {
    private String author;

    public AuthorSearchCriteria(String author) {
        this.author = author;
    }

    @Override
    public List<Book> search(List<Book> books) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}
