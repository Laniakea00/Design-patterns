package BehavioralPatterns.Observer;

// Интерфейс NewsPublisher управляет подписчиками
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String category, String news);
}

