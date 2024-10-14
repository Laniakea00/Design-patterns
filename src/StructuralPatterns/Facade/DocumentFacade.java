package StructuralPatterns.Facade;

import StructuralPatterns.Decorator.WatermarkDecorator;
import StructuralPatterns.Document;
import StructuralPatterns.Flyweight.DocumentFactory;
import StructuralPatterns.Bridge.DocumentRenderer;

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
