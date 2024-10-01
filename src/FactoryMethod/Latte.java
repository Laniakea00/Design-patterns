package FactoryMethod;

class Latte extends CoffeeType {
    public Latte(){
        type = "Latte";
        price = 990;
    }

    @Override
    public void make(){
        System.out.println("Making Latte...");
    }
}


