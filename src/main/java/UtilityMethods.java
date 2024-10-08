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
            System.out.println("Student qualifies for discount of 5.0%");
        }else if(customer instanceof HourlyEmployee){
            System.out.println("Hourly employee qualifies for discount of 10.0%");
        }else if (customer instanceof Manager){
            System.out.println("Manager qualifies for discount of 15.0%");
        }

    }

}
