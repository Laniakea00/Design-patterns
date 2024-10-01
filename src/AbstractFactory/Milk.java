package AbstractFactory;

public abstract class Milk {
    public abstract String getDescription();
}

class LatteMilk extends Milk {
    @Override
    public String getDescription() {
        return "Regular milk for Latte";
    }
}

class ExpressoMilk extends Milk {
    @Override
    public String getDescription() {
        return "No milk for Expresso";
    }
}
