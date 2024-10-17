package BehavioralPatterns.TemplateMethod;

// Абстрактный класс QualityCheck определяет общий алгоритм проверки продукта
public abstract class QualityCheck {
    // Шаблонный метод, описывающий общий процесс проверки
    public final void checkProduct() {
        checkAppearance();
        checkCharacteristics();  // Шаг, который реализуется в подклассах
        printReport();
    }

    // Шаг 1: Проверка внешнего вида (одинаково для всех продуктов)
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида: всё в порядке.");
        System.out.println();
    }

    // Шаг 2: Проверка специфических характеристик (должен быть реализован в подклассах)
    protected abstract void checkCharacteristics();

    // Шаг 3: Заключительный отчёт (одинаково для всех продуктов)
    private void printReport() {
        System.out.println("Проверка завершена. Продукт соответствует стандартам.");
    }
}
