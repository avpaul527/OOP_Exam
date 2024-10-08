public abstract class Employee extends Customer implements Payable, TerminateAble {
    protected final double DISCOUNT = 0.10;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public boolean canGetFired(){
        return true;
    }

    @Override
    public double printPriceAfterDiscount(Cloth clothingItem){
        return clothingItem.getPrice() * (1.0 - DISCOUNT);
    }


}
