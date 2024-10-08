public class Cloth {
    private String name;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public String toString(){
        return name;
        //return name + " in a size " + size + " is $" + price;
    }
}
