package AbstractFactory;

public class LatteIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new LatteMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }

    @Override
    public Sugar createSugar() {
        return new RegularSugar();
    }
}
