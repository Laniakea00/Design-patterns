package BehavioralPatterns.Strategy;

// Стратегия наложенного платежа — добавляет 300 рублей за доставку
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double finalPrice(double orderPrice) {
        double deliveryFee = 300;
        System.out.println("Наложенный платеж: добавлена стоимость доставки 300 рублей.");
        return orderPrice + deliveryFee;
    }
}
