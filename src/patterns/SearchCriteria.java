package patterns;

import entities.Book;
import java.util.List;

public interface SearchCriteria {
    List<Book> search(List<Book> books);
}
