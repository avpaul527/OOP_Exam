public abstract class Customer extends Person {
    private Cloth[] clothingItems;


    public Customer(String name, Size size, Cloth[] clothingItems) {
        super(name, size);
        this.clothingItems = clothingItems;
    }

    public Cloth[] getClothingItems() {
        return clothingItems;
    }

    public double printPriceAfterDiscount(Cloth clothingItem){
        return clothingItem.getPrice();
    }

}
