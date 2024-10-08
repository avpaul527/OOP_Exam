public class Business implements Payable{

    private String name;
    private int productQtySupplied;
    private double productPrice;


    public Business(String name, int productQtySupplied, double productPrice){
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }


    @Override
    public double calculatePay() {
        return productQtySupplied * productPrice;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return calculatePay() >= 100000;
    }

    public void printInfo(){
        System.out.println("Business name: " + name +"\n Total Business Earnings: $" + calculatePay());
    }
}
