package StructuralPatterns.Decorator;

import StructuralPatterns.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {

    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public void display() {
        // Сначала отображаем оригинальный документ
        decoratedDocument.display();

        // Затем добавляем водяной знак
        System.out.println("Добавление водяного знака к документу.");
    }
}
