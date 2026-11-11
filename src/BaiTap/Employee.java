package BaiTap;

public abstract class Employee {
    private String name;
    private int age;
    private double baseSalary;

    public Employee(String name, int age, double baseSalary){
        this.name = name;
        this.age = Math.max(0, age);
        this.baseSalary = Math.max(0, baseSalary);
    }
    public abstract double calculateSalary();
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }
    public void showInfo(){
        System.out.printf("%s %d %.0f %.0f\n", name, age, baseSalary, calculateSalary() );
    }
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        emp[0] = new Lecturer("Nguyen Van A", 30, 5000000, 20, 200000);
        emp[1] = new AdminStaff("Nguyen Van B", 35, 6000000, 1000000);
        for (Employee e : emp) {
            e.showInfo();
        }
    }
}
class Lecturer extends Employee{
    private int soTietDay;
    private double donGia;

    public Lecturer(String name, int age, double baseSalary, int soTietDay, double donGia) {
        super(name, age, baseSalary);
        this.soTietDay = Math.max(0, soTietDay);
        this.donGia = Math.max(0, donGia);
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + (soTietDay * donGia);
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.printf("%d %.0f\n", soTietDay, donGia);
    }
}
class AdminStaff extends Employee{
    private int phuCap;

    public AdminStaff(String name, int age, double baseSalary, int phuCap) {
        super(name, age, baseSalary);
        this.phuCap = Math.max(0, phuCap);
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + phuCap;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.printf("%.0f\n", calculateSalary());
    }
}
