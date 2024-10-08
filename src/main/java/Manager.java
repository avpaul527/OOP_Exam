public class Manager extends Employee {
    protected final double EXTRA_DISCOUNT = 0.05;
    private double salary;

    public Manager(String name, Size size, Cloth[] clothingItems, double salary) {
        super(name, size, clothingItems);
        this.salary = salary;

    }


    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public void printInfo() {
        //System.out.println("Manager Info -> \n" + "Manager Name: " + getName() + "\n Salary: $" + salary + "\n Manager Size: " + getSize() + "Clothing Items: ");
        System.out.println(getName() + " makes $" + salary + " and his shopping bag consists of the following clothing items:");
        for (Cloth clothingItem : getClothingItems()){
            System.out.println(clothingItem);
        }

    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }

    @Override
    public double printPriceAfterDiscount(Cloth clothingItem){
        return clothingItem.getPrice() * (1.0 - (DISCOUNT + EXTRA_DISCOUNT));
    }
}
