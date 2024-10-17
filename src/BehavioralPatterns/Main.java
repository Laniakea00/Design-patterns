package BehavioralPatterns;

import BehavioralPatterns.ChainResponsibility.*;
import BehavioralPatterns.Command.*;
import BehavioralPatterns.Iterator.*;
import BehavioralPatterns.Mediator.*;
import BehavioralPatterns.Memento.*;
import BehavioralPatterns.Observer.*;
import BehavioralPatterns.State.*;
import BehavioralPatterns.Strategy.*;
import BehavioralPatterns.TemplateMethod.*;
import BehavioralPatterns.Visitor.*;




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
        System.out.println();
        System.out.println();


        // Observer
        System.out.println("Observer: ");
        System.out.println();

        // Создаем издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphoneUser = new NewsSubscriberSmartphone();
        Observer laptopUser = new NewsSubscriberLaptop();
        Observer tabletUser = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        newsPublisher.subscribe(smartphoneUser);
        newsPublisher.subscribe(laptopUser);
        newsPublisher.subscribe(tabletUser);

        // Публикуем несколько новостей
        newsPublisher.publishNews("Спорт", "Футбольный матч завершился со счетом 2:1.");
        System.out.println();
        newsPublisher.publishNews("Наука", "Учёные открыли новую планету.");
        System.out.println();
        newsPublisher.publishNews("Технологии", "Новый смартфон представлен на выставке.");
        System.out.println();
        System.out.println();


        // State
        System.out.println("State: ");
        System.out.println();

        // Создаем плеер
        Player player = new Player();

        // Проверяем работу плеера в различных состояниях
        player.play();   // Воспроизведение с начала
        player.pause();  // Пауза
        player.play();   // Возобновление воспроизведения
        player.stop();   // Остановка
        player.pause();  // Попытка поставить на паузу в состоянии остановки
        player.play();   // Запуск с начала после остановки
        System.out.println();
        System.out.println();


        // Strategy
        System.out.println("Strategy: ");
        System.out.println();

        // Создаем заказ с начальной стоимостью
        double orderPrice = 1000.0;
        Order order = new Order();

        // Создаем разные стратегии оплаты
        PaymentStrategy cardPayment = new CardPaymentStrategy();
        PaymentStrategy walletPayment = new WalletPaymentStrategy();
        PaymentStrategy cashOnDelivery = new CashOnDeliveryStrategy();

        // Применяем стратегию оплаты картой
        order.setStrategy(cardPayment);
        System.out.println("Итоговая стоимость заказа (карта): " + order.finalPrice(orderPrice) + " тенге");
        System.out.println();

        // Применяем стратегию оплаты электронным кошельком
        order.setStrategy(walletPayment);
        System.out.println("Итоговая стоимость заказа (кошелек): " + order.finalPrice(orderPrice) + " тенге");
        System.out.println();

        // Применяем стратегию наложенного платежа
        order.setStrategy(cashOnDelivery);
        System.out.println("Итоговая стоимость заказа (наложенный платеж): " + order.finalPrice(orderPrice) + " тенге");
        System.out.println();
        System.out.println();


        // TemplateMethod
        System.out.println("Template Method: ");
        System.out.println();

        // Создаем проверки для продуктов питания и электроники
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();

        // Запускаем процесс проверки для продуктов питания
        System.out.println("Запуск проверки продуктов питания:");
        foodCheck.checkProduct();
        System.out.println();

        // Запускаем процесс проверки для электронной продукции
        System.out.println("Запуск проверки электронной продукции:");
        electronicsCheck.checkProduct();
        System.out.println();
        System.out.println();


        // Visitor
        // Создаем несколько файлов
        File textFile = new TextFile("This is a clean text file.");
        File infectedTextFile = new TextFile("This text contains a virus.");
        File executableFile = new ExecutableFile("binary_code_with_malware");
        File cleanExecutableFile = new ExecutableFile("clean_binary_code");

        // Создаем посетителей
        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        // Проверка файлов антивирусом
        System.out.println("Запуск проверки антивирусом:");
        textFile.accept(antivirusVisitor);
        infectedTextFile.accept(antivirusVisitor);
        executableFile.accept(antivirusVisitor);
        cleanExecutableFile.accept(antivirusVisitor);
        System.out.println();

        // Генерация отчёта
        System.out.println("Генерация отчета о проверке:");
        textFile.accept(reportVisitor);
        infectedTextFile.accept(reportVisitor);
        executableFile.accept(reportVisitor);
        cleanExecutableFile.accept(reportVisitor);
        System.out.println();
    }
}
