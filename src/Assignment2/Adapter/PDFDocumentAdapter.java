package Structural_Patterns.Assignment2.Adapter;

import Structural_Patterns.Assignment2.Document;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    @Override
    public void display() {
        // Открываем PDF документ, используя метод из PDFDocument
        pdfDocument.openPDF();

        // Показываем содержимое PDF документа
        pdfDocument.showPDF();
    }
}
