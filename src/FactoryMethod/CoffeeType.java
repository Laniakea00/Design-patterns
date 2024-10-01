package FactoryMethod;

public abstract class CoffeeType {
    protected String type;
    protected int price;

    public String getType() {
        return type;
    }

    public int getPrice(){
        return price;
    }

    public abstract void make();

    public void cost(){
        System.out.println("Price of " + type + " is: " + price + "tg");
    }
}

