package BehavioralPatterns.Observer;

// Интерфейс Observer описывает поведение подписчиков
public interface Observer {
    void execute(String category, String news);
}
