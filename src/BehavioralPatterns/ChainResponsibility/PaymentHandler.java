package BehavioralPatterns.ChainResponsibility;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    // Устанавливаем следующий способ оплаты в цепочке
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // Абстрактный метод для обработки оплаты
    public abstract void handlePayment(double amount);
}
