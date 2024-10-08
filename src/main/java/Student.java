public class Student extends Customer {
    private long studentID;
    private static long studentsCounter;
    private final double DISCOUNT = 0.05;


    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        studentsCounter++;
        studentID = studentsCounter;
    }

    public static void printStudentsCounter(){
        //System.out.println("Total # of students: " + studentsCounter);
        System.out.println("We have created " + studentsCounter + " students in our database successfully");

    }

    @Override
    public void printInfo() {
        System.out.println("\nStudent ID: " + studentID + " | Student Name: " + getName());

        //System.out.println("\nStudent Info -> \n" + "Student Name: " + getName() + "\n Student ID: " + studentID + "\n Student Size: " + getSize());
        //+ "\n Clothing Needed: ");
        //for (Cloth clothingItem : getClothingItems()){
        //    System.out.println(clothingItem);
       // }
    }

    @Override
    public double printPriceAfterDiscount(Cloth clothingItem){
        return clothingItem.getPrice() * (1.0 - DISCOUNT);
    }
}
