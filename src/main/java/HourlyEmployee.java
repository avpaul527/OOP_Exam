public class HourlyEmployee extends Employee {
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, Cloth[] clothingItems, float hoursWorked, double hourlyWage) {
        super(name, size, clothingItems);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        setHoursWorked(hoursWorked);

    }

    public void setHoursWorked(float hoursWorked) {
        if (hoursWorked < 0) {
            System.out.println("hoursWorked cannot be a negative number");
        } else{
            this.hoursWorked = hoursWorked;
        }
    }

    @Override
    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void printInfo() {
        System.out.println("Employee Info -> \n" + "Employee Name: " + getName() + "\n Hours Worked: " + hoursWorked +"\n Wage per hour: $" + hourlyWage + "\n Employee Size: " + getSize() + "Clothing Items: ");
        for (Cloth clothingItem : getClothingItems()){
            System.out.println(clothingItem);
        }

    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }


}
