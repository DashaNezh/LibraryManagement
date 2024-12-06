package patterns;

public class OnlinePaymentSystem implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Обработка онлайн-платежей по: $" + amount);
    }
}
