package patterns;

public class BookRating implements RatingComponent {
    private String bookTitle;
    private int rating;

    public BookRating(String bookTitle, int rating) {
        this.bookTitle = bookTitle;
        this.rating = rating;
    }

    @Override
    public void display() {
        System.out.println("Rating for " + bookTitle + ": " + rating + " stars");
    }
}
