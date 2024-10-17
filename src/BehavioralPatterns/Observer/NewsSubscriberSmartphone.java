package BehavioralPatterns.Observer;

// Подписчик для смартфона, интересуется новостями категории "Спорт"
public class NewsSubscriberSmartphone implements Observer{
    @Override
    public void execute(String category, String news){
        if(news.equals("Спорт")){
            System.out.println("Уведомление на смартфоне: " + news);
        }
    }
}
