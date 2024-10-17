package BehavioralPatterns.Observer;

// Подписчик для планшета, получает все новости
public class NewsSubscriberTablet implements Observer {
    @Override
    public void execute(String category, String news){
        System.out.println("Уведомление на планшете: " + news);
    }
}
