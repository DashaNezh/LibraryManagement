package entities;

public abstract class Book {
    private String title;
    private String author;
    private int popularity;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Абстрактный метод, который должны реализовать все наследники
    public abstract String getDescription();

    // Геттеры и сеттеры для других полей
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Геттер и сеттер для популярности
    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
}
