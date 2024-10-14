package BehavioralPatterns.Memento;

// Класс TextMemento: хранит состояние текста
public class TextMemento {
    private String textState;

    // Конструктор сохраняет состояние текста
    public TextMemento(String state) {
        this.textState = state;
    }

    // Возвращает сохранённое состояние текста
    public String getTextState() {
        return textState;
    }
}
