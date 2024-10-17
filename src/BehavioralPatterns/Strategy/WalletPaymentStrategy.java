package BehavioralPatterns.Strategy;

// Стратегия оплаты электронным кошельком — без комиссии
public class WalletPaymentStrategy implements PaymentStrategy{
    @Override
    public double finalPrice(double orderPrice){
        System.out.println("Оплата через электронный кошелек: без комиссии.");
        return orderPrice;
    }
}
