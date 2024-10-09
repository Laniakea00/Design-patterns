package Structural_Patterns.Assignment2.Proxy;

import Structural_Patterns.Assignment2.Document;
import Structural_Patterns.Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        // Загрузка документа только при первом отображении
        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }

        // Отображаем документ
        realDocument.display();
    }
}
