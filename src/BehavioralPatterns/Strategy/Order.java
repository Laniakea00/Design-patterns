package BehavioralPatterns.Strategy;

// Класс Order управляет текущей стратегией оплаты и рассчитывает итоговую стоимость заказа
public  class Order {
    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double finalPrice(double orderPrice) {
        return paymentStrategy.finalPrice(orderPrice);
    }
}
