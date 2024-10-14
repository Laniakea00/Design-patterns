package BehavioralPatterns.Memento;

 // Класс TextEditor: редактор текста, который может сохранять и восстанавливать состояние
public class TextEditor {
    private StringBuilder text = new StringBuilder();

    // Метод для добавления текста в редактор
    public void addText(String newText) {
        text.append(newText);
    }

    // Возвращает текущий текст
    public String getText() {
        return text.toString();
    }

    // Создаёт снимок текущего состояния текста
    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    // Восстанавливает состояние текста из снимка
    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getTextState());
    }
}
