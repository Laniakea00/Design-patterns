package BehavioralPatterns.Mediator;

// Интерфейс Sensor: определяет базовый функционал для всех сенсоров
public interface Sensor {
    // Метод для передачи данных через посредника
    void sendData();
}