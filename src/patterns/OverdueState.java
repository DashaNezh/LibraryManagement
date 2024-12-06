package patterns;

public class OverdueState extends LoanStateHandler {
    @Override
    public void handle() {
        System.out.println("Бронирование просрочено! Применяется штраф.");
    }
}
