package Structural_Patterns;

import Structural_Patterns.Assignment2.*;
import Structural_Patterns.Assignment2.Adapter.PDFDocumentAdapter;
import Structural_Patterns.Assignment2.Bridge.*;
import Structural_Patterns.Assignment2.Composite.DocumentGroup;
import Structural_Patterns.Assignment2.Facade.DocumentFacade;
import Structural_Patterns.Assignment2.Flyweight.DocumentFactory;


public class Main {
    public static void main(String[] args) {

        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        System.out.println("\n6. Рендеринг документа через движок:");

        // 6. Использование Bridge для рендеринга
        RenderEngine simpleEngine = new SimpleRenderEngine();
        DocumentRenderer simpleRenderer = new SimpleDocumentRenderer(simpleEngine);
        facade.renderDocument("Report", simpleRenderer);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        DocumentRenderer highlightRenderer = new SimpleDocumentRenderer(highlightEngine);
        facade.renderDocument("Report", highlightRenderer);
    }
}