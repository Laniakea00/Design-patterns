package BehavioralPatterns.Visitor;

// Класс TextFile представляет текстовый файл
public class TextFile implements File {
    private String content;

    public TextFile(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}