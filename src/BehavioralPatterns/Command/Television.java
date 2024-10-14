package BehavioralPatterns.Command;

// Класс Television: содержит методы управления телевизором, такие как включение/выключение,
// регулировка громкости, переключение каналов
public class Television {
    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        System.out.println("Громкость увеличена.");
    }

    public void volumeDown() {
        System.out.println("Громкость уменьшена.");
    }

    public void nextChannel() {
        System.out.println("Переключено на следующий канал.");
    }

    public void previousChannel() {
        System.out.println("Переключено на предыдущий канал.");
    }
}
