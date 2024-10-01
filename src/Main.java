import AbstractFactory.*;
import AbstractFactory.Latte;
import Builder.*;
import FactoryMethod.*;
import FactoryMethod.CoffeeType;
import Prototype.*;
import Singleton.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Factory Method
        CoffeeFactory expressoFactory = new ExpressoFactory();
        CoffeeType expresso = expressoFactory.createCoffee();
        expresso.make();

        // Abstract Factory
        CoffeeIngredientsFactory latteIngredientFactory = new LatteIngredientsFactory();
        CoffeeOrder latteOrder = new CoffeeOrder(new Latte(), latteIngredientFactory);
        latteOrder.prepareOrder();

        // Prototype
        CoffeeOrder clonedOrder = latteOrder.clone();
        if (clonedOrder != null) {
            System.out.println("Cloning order...");
            clonedOrder.prepareOrder();
        }

        // Builder
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        Builder.Coffee customCoffee = coffeeBuilder
                .setType("Latte")
                .setMilk("Almond")
                .setSyrup("Vanilla")
                .setSize("Large")
                .build();


        coffeeShop.placeOrder(customCoffee);
        System.out.println(customCoffee.getDescription());
    }
}
