package AbstractFactory;

public abstract class Syrup {
    public abstract String getDescription();
}

class VanillaSyrup extends Syrup {
    @Override
    public String getDescription() {
        return "Vanilla syrup";
    }
}

class NoSyrup extends Syrup {
    @Override
    public String getDescription() {
        return "No syrup";
    }
}
