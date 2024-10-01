package AbstractFactory;

public class Latte extends Coffee {
    public Latte(){
        type = "Latte";
        price = 990;
    }

    @Override
    public void prepare() {
        System.out.println("Making Latte...");
    }
}

