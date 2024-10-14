package BehavioralPatterns.Iterator;

public interface Iterator<T> {
    // Проверяет, есть ли следующий элемент в коллекции
    boolean hasNext();

    // Возвращает следующий элемент коллекции
    T next();
}