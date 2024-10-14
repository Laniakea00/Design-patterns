package BehavioralPatterns.ChainResponsibility;

public class PaymentA extends PaymentHandler {
    private double balance = 100;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentA");
        } else if (next != null) {
            System.out.println("Недостаточно средств на PaymentA, переходим к следующему...");
            next.handlePayment(amount);
        }
    }
}