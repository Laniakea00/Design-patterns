package BehavioralPatterns.Mediator;

// Интерфейс HomeMediator: определяет взаимодействие между сенсорами
public interface HomeMediator {
    // Метод для получения данных от сенсора
    void receiveData(String data, Sensor sensor);

    // Метод для выполнения действий на основе собранных данных
    void printReport();
}