package BehavioralPatterns.Mediator;

// Класс LightSensor: сенсор освещенности, который передает данные посреднику
public class LightSensor implements Sensor {
    private HomeMediator mediator;  // Посредник

    // Конструктор: принимает посредника и инициализирует его
    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Метод для передачи данных освещенности через посредника
    @Override
    public void sendData() {
        String data = "300 люкс";  // Пример данных освещенности
        System.out.println("Сенсор освещенности: отправка данных освещенности...");
        mediator.receiveData(data, this);
    }
}
