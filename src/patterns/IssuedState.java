package patterns;

public class IssuedState extends LoanStateHandler {
    @Override
    public void handle() {
        System.out.println("Книга выдается пользователю.");
    }
}
