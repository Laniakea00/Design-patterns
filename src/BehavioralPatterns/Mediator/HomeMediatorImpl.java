package BehavioralPatterns.Mediator;

// Класс HomeMediatorImpl: реализация посредника, который собирает данные от сенсоров
public class HomeMediatorImpl implements HomeMediator {
    private String temperatureData;  // Данные температуры
    private String humidityData;     // Данные влажности
    private String lightData;        // Данные освещенности

    // Метод для получения данных от сенсора
    @Override
    public void receiveData(String data, Sensor sensor) {
        if (sensor instanceof TemperatureSensor) {
            temperatureData = data;
        } else if (sensor instanceof HumiditySensor) {
            humidityData = data;
        } else if (sensor instanceof LightSensor) {
            lightData = data;
        }
    }

    // Метод для вывода отчета с собранными данными от сенсоров
    @Override
    public void printReport() {
        System.out.println("Отчет умного дома:");
        System.out.println("Температура: " + temperatureData);
        System.out.println("Влажность: " + humidityData);
        System.out.println("Освещенность: " + lightData);
    }
}