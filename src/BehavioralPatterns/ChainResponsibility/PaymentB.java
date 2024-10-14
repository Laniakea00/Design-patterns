package BehavioralPatterns.ChainResponsibility;

public class PaymentB extends PaymentHandler {
    private double balance = 300;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentB");
        } else if (next != null) {
            System.out.println("Недостаточно средств на PaymentB, переходим к следующему...");
            next.handlePayment(amount);
        }
    }
}