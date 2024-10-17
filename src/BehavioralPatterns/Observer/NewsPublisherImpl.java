package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Реализация издателя новостей
public class NewsPublisherImpl implements NewsPublisher{
    private List<Observer> subscribers = new ArrayList<>();

    // Метод для добавления подписчика
    @Override
    public void subscribe(Observer observer){
        subscribers.add(observer);
    }

    // Метод для удаления подписчика
    @Override
    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }

    // Метод для уведомления подписчиков
    @Override
    public void notifySubscribers(String category, String news){
        for (Observer subscriber : subscribers) {
            subscriber.execute(category, news);
        }
    }

    // Метод для публикации новостей
    public void publishNews(String category, String news) {
        System.out.println("Опубликована новость в категории '" + category + "': " + news);
        notifySubscribers(category, news);
    }
}
