public class Main {

    public static void main(String[] args) {


        Cloth clothingItem1 = new Cloth("Jeans", 20.0, Size.S);
        Cloth clothingItem2 = new Cloth("T-shirt", 8.0, Size.M);
        Cloth clothingItem3 = new Cloth("Hat", 2.0, Size.L);

        Cloth[] shoppingBag = {clothingItem1, clothingItem2, clothingItem3};

        System.out.println("Subtotal of clothing items: $" + UtilityMethods.calculateSubtotal(shoppingBag));


        Student student1 = new Student("Mike", Size.L, shoppingBag);
        Student student2 = new Student("Jane", Size.S, shoppingBag);

        Student[] listOfStudents = {student1, student2};

        for(Student student : listOfStudents){
            student.printInfo();
        }

        System.out.println(" ");

        Student.printStudentsCounter();

        System.out.println(" ");

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex", Size.S, shoppingBag, 40.0F, 20.0);

        hourlyEmployee.setHoursWorked(-5);

        System.out.println(" ");

        Manager manager = new Manager("Terry", Size.L, shoppingBag, 100000);
        manager.printInfo();

        System.out.println(" ");

        System.out.println("Jeans will cost Alex : $" + hourlyEmployee.printPriceAfterDiscount(clothingItem1));

        System.out.println(" ");

        System.out.println("It is " + UtilityMethods.checkFitting(student1, clothingItem3) + " that the " + clothingItem3 + " fits " + student1.getName());

        System.out.println(" ");

        Business business = new Business("Acme", 10000, 20);

        System.out.println("Is this biz taxable?: " + business.payTaxOnEarnings());

        System.out.println(" ");

        Payable[] payableEntities = {hourlyEmployee, manager, business};
        UtilityMethods.printClassNameOfPayableEntities(payableEntities);

        System.out.println(" ");

        








    }
}
