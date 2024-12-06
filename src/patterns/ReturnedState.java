package patterns;

public class ReturnedState extends LoanStateHandler {
    @Override
    public void handle() {
        System.out.println("Book has been returned.");
    }
}
