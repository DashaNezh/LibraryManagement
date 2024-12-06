package patterns;

public class IssuedState extends LoanStateHandler {
    @Override
    public void handle() {
        System.out.println("Book is issued to the user.");
    }
}
