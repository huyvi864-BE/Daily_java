package Dlad;
import java.util.Scanner;
public class GiaoVien {
    private String MaGV;
    private String HoTen;
    private double Luong;

    public GiaoVien(String MaGV , String HoTen, double Luong){
        this.MaGV = MaGV;
        this.HoTen = HoTen;
        this.Luong = Math.max(0, Luong);
    }
    public String getMaGV(){
        return this.MaGV;}
    public double getLuong(){
        return this.Luong;
    }
    public void setLuong(double Luong){
        this.Luong = Math.max(0, Luong);
    }
    public int bacLuong(){
        return Integer.parseInt(this.MaGV.substring(2, 4));
    }
    public double phuCap(String MaGV){
        if (this.MaGV.charAt(0) == 'H' && this.MaGV.charAt(1) == 'T'){
            return 2000000;
        } else if (this.MaGV.charAt(0) == 'H' && this.MaGV.charAt(1) == 'P'){
            return 900000;
        }else if (this.MaGV.charAt(0) == 'G' && this.MaGV.charAt(1) == 'V'){
            return 500000;
        } else {
            return 0;
        }
    }
    public double thuNhap(){
        return this.Luong*bacLuong() + this.phuCap(this.MaGV);
    }
    public void showInfo(){
        System.out.printf("%s %s %s %.0f %.0f\n", this.MaGV, this.HoTen, this.bacLuong(), this.phuCap(this.MaGV), this.thuNhap());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String MaGV = sc.nextLine();
        String HoTen = sc.nextLine();
        double Luong = sc.nextDouble();

        GiaoVien gv1 = new GiaoVien(MaGV, HoTen, Luong);
        gv1.showInfo();
    }
}
