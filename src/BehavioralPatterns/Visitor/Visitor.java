package BehavioralPatterns.Visitor;

// Интерфейс Visitor определяет методы для взаимодействия с разными типами файлов
public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
