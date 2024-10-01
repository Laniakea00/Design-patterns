package FactoryMethod;

public class LatteFactory extends CoffeeFactory {
    @Override
    public CoffeeType createCoffee() {
        return new Latte();
    }
}
