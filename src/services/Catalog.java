package services;

import entities.Book;
import patterns.SearchCriteria;
import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog(List<Book> books) {
        this.books = books;
    }

    public List<Book> search(SearchCriteria criteria) {
        return criteria.search(books);
    }
}
