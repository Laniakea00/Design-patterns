package Structural_Patterns.Assignment2.Composite;

import Structural_Patterns.Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document);
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    @Override
    public void display() {
        // Отображаем все документы в группе
        for (Document doc : documents) {
            doc.display();
        }
    }
}
