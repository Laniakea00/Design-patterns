package BehavioralPatterns.Memento;

// Класс Caretaker: отвечает за сохранение и восстановление снимков
public class Caretaker {
    private TextMemento memento;

    // Сохраняет снимок состояния текста
    public void saveMemento(TextMemento memento) {
        this.memento = memento;
    }

    // Возвращает сохранённое состояние текста
    public TextMemento getMemento() {
        return memento;
    }
}
