package BehavioralPatterns.Visitor;

// Класс AntivirusVisitor выполняет проверку файлов на наличие угроз
public class AntivirusVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла на запрещённые слова...");
        if (textFile.getContent().contains("virus")) {
            System.out.println("Обнаружено запрещённое слово 'virus'!");
        } else {
            System.out.println("Текстовый файл безопасен.");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла на наличие вредоносного кода...");
        if (executableFile.getBinaryCode().contains("malware")) {
            System.out.println("Обнаружен вредоносный код 'malware'!");
        } else {
            System.out.println("Исполняемый файл безопасен.");
        }
    }
}
