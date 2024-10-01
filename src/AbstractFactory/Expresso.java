package AbstractFactory;

public class Expresso extends Coffee {
    public Expresso(){
        type = "Expresso";
        price = 1090;
    }

    @Override
    public void prepare() {
        System.out.println("Making Expresso...");
    }
}
