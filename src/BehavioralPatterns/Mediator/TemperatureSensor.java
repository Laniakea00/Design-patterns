package BehavioralPatterns.Mediator;

// Класс TemperatureSensor: сенсор температуры, который передает данные посреднику
public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;  // Посредник

    // Конструктор: принимает посредника и инициализирует его
    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Метод для передачи данных температуры через посредника
    @Override
    public void sendData() {
        String data = "22°C";  // Пример данных температуры
        System.out.println("Температурный сенсор: отправка данных температуры...");
        mediator.receiveData(data, this);
    }
}