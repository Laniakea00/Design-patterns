package FactoryMethod;

public class ExpressoFactory extends CoffeeFactory {
    @Override
    public CoffeeType createCoffee() {
        return new Expresso();
    }
}
