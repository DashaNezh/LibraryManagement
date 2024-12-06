package entities;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public String getDescription() {
        return String.format("E-Book: %s by %s, Size: %.2f MB, Format: %s",
                getTitle(), getAuthor(), fileSize, format);
    }
}
