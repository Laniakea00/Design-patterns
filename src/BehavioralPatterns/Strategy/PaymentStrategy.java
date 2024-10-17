package BehavioralPatterns.Strategy;

public interface PaymentStrategy {
    // Интерфейс PaymentStrategy описывает метод для расчета финальной стоимости заказа
    double finalPrice(double orderPrice);

}
