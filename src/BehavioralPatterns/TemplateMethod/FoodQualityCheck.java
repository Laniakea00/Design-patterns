package BehavioralPatterns.TemplateMethod;

// Класс для проверки качества продуктов питания
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Проверка продуктов питания: срок годности в норме.");
        System.out.println("Проверка продуктов питания: состав соответствует нормам.");
        System.out.println();
    }
}
