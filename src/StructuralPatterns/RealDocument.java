package StructuralPatterns;

public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Выводим сообщение о загрузке документа с диска
        System.out.println("Загрузка документа с диска: " + title);
    }

    @Override
    public void display() {
        // Выводим сообщение об отображении документа
        System.out.println("Отображение документа: " + title);
    }
}
