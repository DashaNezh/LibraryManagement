package entities;

public class PrintedBook extends Book {
    private String shelfLocation;  // Местоположение книги на полке

    public PrintedBook(String title, String author, String shelfLocation) {
        super(title, author);
        this.shelfLocation = shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    // Реализация абстрактного метода getDescription
    @Override
    public String getDescription() {
        return "Printed book: " + getTitle() + " by " + getAuthor() + " located at " + shelfLocation;
    }
    @Override
    public int getPopularity() {
        // Логика для вычисления популярности для печатной книги
        return super.getPopularity();
    }
}
