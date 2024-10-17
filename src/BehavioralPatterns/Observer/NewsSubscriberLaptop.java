package BehavioralPatterns.Observer;

// Подписчик для ноутбука, интересуется новостями категории "Наука"
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void execute(String category, String news) {
        if(news.equals("Наука")){
            System.out.println("Уведомление на ноутбуке: " + news);
        }
    }
}