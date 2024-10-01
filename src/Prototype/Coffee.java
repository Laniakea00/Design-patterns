package Prototype;

public class Coffee {
    private String type;
    private String milk;
    private String syrup;
    private String size;

    public Coffee(String type, String milk, String syrup, String size) {
        this.type = type;
        this.milk = milk;
        this.syrup = syrup;
        this.size = size;
    }

    public String getDescription() {
        return type + " coffee with " + milk + " milk, " + syrup + " syrup, size " + size;
    }
}