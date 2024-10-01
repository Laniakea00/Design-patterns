package AbstractFactory;

public abstract class Coffee {
    public String type;
    public int price;

    public abstract void prepare();

    public void makeCoffee(CoffeeIngredientsFactory factory) {
        Milk milk = factory.createMilk();
        Syrup syrup = factory.createSyrup();
        Sugar sugar = factory.createSugar();

        System.out.println("Preparing " + type + " with:");
        System.out.println(milk.getDescription());
        System.out.println(syrup.getDescription());
        System.out.println(sugar.getDescription());
    }

    public void cost(){
        System.out.println("Price of " + type + " is: " + price + "tg");
    }
}
