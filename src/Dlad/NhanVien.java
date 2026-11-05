package Dlad;
import java.util.Scanner;
public class NhanVien {
    private String MaNV;
    private String HoTen;
    private double Luong;
    private int NgayCong;
    private String ChucVu;

    public NhanVien(String MaNV, String HoTen, double Luong, int NgayCong, String ChucVu){
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.Luong = Math.max(0, Luong);
        this.NgayCong = NgayCong;
        this.ChucVu = ChucVu;
    }
    public void setLuong(double Luong){
        this.Luong = Math.max(0, Luong);
    }
    public double TienThuong() {
        if (this.NgayCong >= 25) {
            return this.LuongThang() * 0.2;
        }
        if (this.NgayCong >= 22) {
            return this.LuongThang() * 0.1;
        }
        return 0;
    }
    public double phuCap(){
        if (this.ChucVu.equals("GD")) {
            return 250000;
        }
        if (this.ChucVu.equals("PGD")) {
            return 200000;
        }
        if (this.ChucVu.equals("TP")) {
            return 180000;
        }
        if (this.ChucVu.equals("NV")) {
            return 150000;
        }
        return 0;
    }
    public double LuongThang(){
        return this.Luong * this.NgayCong;
    }
    public double TienLuong(){
        return this.LuongThang() + this.TienThuong() +this.phuCap();
    }
    public void showInfo(){
        System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", this.MaNV, this.HoTen, this.LuongThang(), this.TienThuong(), this.phuCap(), this.TienLuong());
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String HoTen = sc.nextLine();
            double Luong = sc.nextDouble();
            int NgayCong = sc.nextInt();
            String ChucVu = sc.next();
            String MaNV = "NV01";
            NhanVien nv = new NhanVien(MaNV, HoTen, Luong, NgayCong, ChucVu);
            nv.showInfo();
            sc.close();
     }
}

