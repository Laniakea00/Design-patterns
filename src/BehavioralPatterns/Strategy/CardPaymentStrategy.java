package BehavioralPatterns.Strategy;

// Стратегия оплаты банковской картой — добавляет комиссию 2% от стоимости заказа
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double finalPrice(double orderPrice) {
        double fee = orderPrice * 0.02;
        System.out.println("Оплата картой: добавлена комиссия 2%. Комиссия: " + fee);
        return orderPrice + fee;
    }
}
