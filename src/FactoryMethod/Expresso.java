package FactoryMethod;

class Expresso extends CoffeeType{
    public Expresso(){
        type = "Expresso";
        price = 1090;
    }

    @Override
    public void make(){
        System.out.println("Making Expresso...");
    }
}

