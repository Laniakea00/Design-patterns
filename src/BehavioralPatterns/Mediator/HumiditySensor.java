package BehavioralPatterns.Mediator;

// Класс HumiditySensor: сенсор влажности, который передает данные посреднику
public class HumiditySensor implements Sensor {
    private HomeMediator mediator;  // Посредник

    // Конструктор: принимает посредника и инициализирует его
    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Метод для передачи данных влажности через посредника
    @Override
    public void sendData() {
        String data = "45%";  // Пример данных влажности
        System.out.println("Сенсор влажности: отправка данных влажности...");
        mediator.receiveData(data, this);
    }
}