package patterns;

import entities.Book;
import java.util.List;
import java.util.stream.Collectors;

public class TitleSearchCriteria implements SearchCriteria {
    private String title;

    public TitleSearchCriteria(String title) {
        this.title = title;
    }

    @Override
    public List<Book> search(List<Book> books) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }
}
