package Builder;

public class CoffeeBuilder {
    private String type;
    private String milk;
    private String syrup;
    private String size;

    public CoffeeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CoffeeBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder setSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public Coffee build() {
        return new Coffee(type, milk, syrup, size);
    }
}


