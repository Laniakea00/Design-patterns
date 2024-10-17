package BehavioralPatterns.Visitor;

// Класс ReportVisitor генерирует отчёт о проверке файлов
public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерация отчета для текстового файла...");
        System.out.println("Содержимое текстового файла: " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерация отчета для исполняемого файла...");
        System.out.println("Код исполняемого файла: " + executableFile.getBinaryCode());
    }
}
