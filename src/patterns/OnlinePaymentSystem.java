package patterns;

public class OnlinePaymentSystem implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Processing online payment of: $" + amount);
    }
}
