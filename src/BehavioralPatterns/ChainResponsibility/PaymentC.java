package BehavioralPatterns.ChainResponsibility;

public class PaymentC extends PaymentHandler {
    private double balance = 1000;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentC");
        } else {
            System.out.println("Недостаточно средств на всех способах оплаты");
        }
    }
}