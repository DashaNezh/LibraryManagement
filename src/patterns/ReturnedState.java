package patterns;

public class ReturnedState extends LoanStateHandler {
    @Override
    public void handle() {
        System.out.println("Книга была возвращена.");
    }
}
