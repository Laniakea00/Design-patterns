package Structural_Patterns.Assignment2.Flyweight;

import Structural_Patterns.Assignment2.Document;
import Structural_Patterns.Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Метод для получения документа
    public static Document getDocument(String title) {
        // Если документ уже есть, возвращаем его
        if (documentMap.containsKey(title)) {
            return documentMap.get(title);
        }

        // Если документа нет, создаём новый и сохраняем его
        Document document = new RealDocument(title);
        documentMap.put(title, document);
        return document;
    }
}
