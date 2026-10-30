package BaiTap;

public class Vehicle {
    private String name;
    private String xe;
    private int dungTich;
    private double triGia;

    public Vehicle(String name, String xe, int dungTich, int triGia){
        this.name = name;
        this.xe = xe;
        this.dungTich =Math.max(0,dungTich);
        this.triGia = Math.max(0,triGia);
    }
    public void setdungTich(int dungTich){
        this.dungTich = Math.max(0, dungTich);
    }
    public void setTriGia(double triGia){
        this.triGia = Math.max(0, triGia);
    }
    public double tinhThue(){
        if (this.dungTich < 100) return  this.triGia*0.1;
        if (this.dungTich < 200) return this.triGia*0.3;
        return this.triGia*0.5;
    }
    public void showInfo(){
        System.out.printf("%-6s %-8s %-8d %-8.2f %-8.2f%n", this.name ,this.xe, this.dungTich ,this.triGia ,this.tinhThue());
    }

}
class Bai03{
    public static  void main(String[] args){
        Vehicle v1 = new Vehicle("Nguyen Van A", "Honda", 90, 20000000);
        Vehicle v2 = new Vehicle("Nguyen Van B", "Yamaha", 150, 30000000);
        Vehicle v3 = new Vehicle("Nguyen Van C", "Suzuki", 250, 40000000);
        System.out.printf("%-6s %-8s %-8s %-8s %-8s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        v1.showInfo();
        v2.showInfo();
        v3.showInfo();
    }
}
