package AbstractFactory;

public class ExpressoIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new ExpressoMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new NoSyrup();
    }

    @Override
    public Sugar createSugar() {
        return new NoSugar();
    }
}
