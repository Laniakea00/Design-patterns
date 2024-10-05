package Structural_Patterns.Assignment2.Facade;

import Structural_Patterns.Assignment2.Composite.DocumentGroup;
import Structural_Patterns.Assignment2.Decorator.WatermarkDecorator;
import Structural_Patterns.Assignment2.Document;
import Structural_Patterns.Assignment2.Flyweight.DocumentFactory;
import Structural_Patterns.Assignment2.Bridge.DocumentRenderer;
import Structural_Patterns.Assignment2.Proxy.ProxyDocument;

public class DocumentFacade {

    // Метод для отображения документа
    public void displayDocument(String title) {
        // Получаем документ через фабрику
        Document document = DocumentFactory.getDocument(title);

        // Отображаем документ
        document.display();
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        // Получаем документ через фабрику
        Document document = DocumentFactory.getDocument(title);

        // Оборачиваем документ декоратором с водяным знаком
        Document watermarkedDocument = new WatermarkDecorator(document);

        // Отображаем обёрнутый документ
        watermarkedDocument.display();
    }

    // Метод для рендеринга документа через указанный движок
    public void renderDocument(String title, DocumentRenderer renderer) {
        // Получаем документ через фабрику
        Document document = DocumentFactory.getDocument(title);

        // Рендерим документ
        renderer.render(title);
    }
}
