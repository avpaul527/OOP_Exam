public abstract class Person {
    private String name;
    private Size size;

    public Person(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public abstract void printInfo();

}
