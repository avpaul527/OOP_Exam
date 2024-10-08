public class UtilityMethods {


    public static boolean checkFitting(Customer customer, Cloth clothingItem){
        return customer.getSize() == clothingItem.getSize();
    }

    public static double calculateSubtotal(Cloth[] clothingItems){
        double subtotal = 0;
        for (Cloth clothingItem : clothingItems){
            subtotal = subtotal + clothingItem.getPrice();
        }
        return subtotal;
    }

    public static void printClassNameOfPayableEntities (Payable[] payables) {
        for (Payable payable : payables) {
            System.out.println(payable.getClass().getSimpleName());
        }
    }

    public static void checkCustomerDiscount(Customer customer){
        if (customer instanceof Student) {
            System.out.println("Student gets discount of 5% off!");
        }else if(customer instanceof HourlyEmployee){
            System.out.println("Hourly employee gets a discount of 10% off!");
        }else if (customer instanceof Manager){
            System.out.println("Manager gets discount of 15% off!");
        }

    }

}
