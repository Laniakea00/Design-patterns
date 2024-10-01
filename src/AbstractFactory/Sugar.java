package AbstractFactory;

public abstract class Sugar {
    public abstract String getDescription();
}

class RegularSugar extends Sugar {
    @Override
    public String getDescription() {
        return "Regular sugar";
    }
}

class NoSugar extends Sugar {
    @Override
    public String getDescription() {
        return "No sugar";
    }
}
