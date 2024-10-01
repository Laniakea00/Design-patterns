package Prototype;

import AbstractFactory.*;
import AbstractFactory.Coffee;



public class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private CoffeeIngredientsFactory ingredients;

    public CoffeeOrder(Coffee coffee, CoffeeIngredientsFactory ingredients) {
        this.coffee = coffee;
        this.ingredients = ingredients;
    }

    @Override
    public CoffeeOrder clone() {
        try {
            return (CoffeeOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void prepareOrder() {
        coffee.makeCoffee(ingredients);
        Milk milk = ingredients.createMilk();
        Syrup syrup = ingredients.createSyrup();
        Sugar sugar = ingredients.createSugar();

        if (milk != null) {
            System.out.println("Adding " + milk.getDescription());
        }
        if (syrup != null) {
            System.out.println("Adding " + syrup.getDescription());
        }
        if (sugar != null) {
            System.out.println("Adding " + sugar.getDescription());
        }
    }
}