package BehavioralPatterns;

import BehavioralPatterns.ChainResponsibility.*;
import BehavioralPatterns.Command.*;
import BehavioralPatterns.Iterator.*;
import BehavioralPatterns.Mediator.*;
import BehavioralPatterns.Memento.*;

public class Main {
    public static void main(String[] args){

        // Chain of Responsibility
        System.out.println("Chain of Responsibility: ");
        System.out.println();

        // Создаем обработчики оплаты
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Устанавливаем цепочку обязанностей
        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        // Попытка оплаты на сумму 210 долларов
        double amountToPay = 210;
        paymentA.handlePayment(amountToPay);
        System.out.println();
        System.out.println();

        // Command
        System.out.println("Command: ");
        System.out.println();

        // Создаем телевизор
        Television tv = new Television();

        // Создаем команды
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command previousChannel = new PreviousChannelCommand(tv);

        // Создаем пульт
        RemoteControl remote = new RemoteControl();

        // Связываем кнопки пульта с командами
        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);
        remote.setCommand(4, nextChannel);
        remote.setCommand(5, previousChannel);

        // Тестируем команды
        remote.pressButton(0); // Включаем телевизор
        remote.pressButton(2); // Увеличиваем громкость
        remote.pressButton(4); // Переключаем канал вперед
        remote.pressButton(5); // Переключаем канал назад
        remote.pressButton(3); // Уменьшаем громкость
        remote.pressButton(1); // Выключаем телевизор
        System.out.println();
        System.out.println();

        // Iterator
        System.out.println("Iteratoe: ");
        System.out.println();

        // Создаем коллекцию фильмов на основе List
        ListMovieCollection listMovies = new ListMovieCollection();
        listMovies.addMovie("Фильм 1");
        listMovies.addMovie("Фильм 2");
        listMovies.addMovie("Фильм 3");

        // Создаем коллекцию фильмов на основе массива
        ArrayMovieCollection arrayMovies = new ArrayMovieCollection(3);
        arrayMovies.addMovie("Фильм A");
        arrayMovies.addMovie("Фильм B");
        arrayMovies.addMovie("Фильм C");

        // Выводим фильмы из коллекции на основе List
        System.out.println("Фильмы в Листе:");
        Iterator<String> listIterator = listMovies.createIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();

        // Выводим фильмы из коллекции на основе массива
        System.out.println("Фильмы в Массиве:");
        Iterator<String> arrayIterator = arrayMovies.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        System.out.println();
        System.out.println();

        // Mediator
        System.out.println("Mediator: ");
        System.out.println();

        // Создаем посредника
        HomeMediator mediator = new HomeMediatorImpl();

        // Создаем сенсоры
        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        // Сенсоры передают данные через посредника
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();
        System.out.println();

        // Вывод отчета от посредника
        ((HomeMediatorImpl) mediator).printReport();
        System.out.println();
        System.out.println();


        // Memento Mori
        System.out.println("Memento: ");
        System.out.println();

        // Создаем редактор и хранителя состояний
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавляем текст в редактор
        editor.addText("Привет, мир!");
        System.out.println("Текущий текст: " + editor.getText());

        // Сохраняем состояние текста
        caretaker.saveMemento(editor.save());

        // Добавляем ещё текст
        editor.addText(" Добавим ещё немного текста.");
        System.out.println("Текущий текст: " + editor.getText());

        // Восстанавливаем предыдущее состояние текста
        editor.restore(caretaker.getMemento());
        System.out.println("Восстановленный текст: " + editor.getText());
    }
}
