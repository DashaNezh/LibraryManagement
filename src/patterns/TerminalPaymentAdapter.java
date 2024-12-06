package patterns;

public class TerminalPaymentAdapter implements PaymentSystem {
    private TerminalPayment terminalPayment;

    public TerminalPaymentAdapter(TerminalPayment terminalPayment) {
        this.terminalPayment = terminalPayment;
    }

    @Override
    public void pay(double amount) {
        terminalPayment.processPayment(amount);
    }
}
