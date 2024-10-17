package BehavioralPatterns.TemplateMethod;

// Класс для проверки качества электронной продукции
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Проверка электронной продукции: устройство работает.");
        System.out.println("Проверка электронной продукции: гарантия предоставлена.");
        System.out.println();
    }
}

