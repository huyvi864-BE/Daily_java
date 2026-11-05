package Dlad;
import java.util.Scanner;
public class MatHang {
    private String MaMH;
    private final String TenMH;
    private final String DonViTinh;
    private int GiaMua;
    private int GiaBan;

    public MatHang(String MaMH, String TenMH, String DonViTinh, int GiaMua, int GiaBan){
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.DonViTinh = DonViTinh;
        this.GiaMua = Math.max(0, GiaMua);
        this.GiaBan = Math.max(0,GiaBan);
    }
    public void setMaMH(String MaMH){
        this.MaMH = MaMH;
    }
    public String getMaMH(){
        return this.MaMH;
    }
    public String getTenMH(){
        return TenMH;
    }
    public String getDonViTinh(){
        return DonViTinh;
    }
    public int getGiaMua(){
        return GiaMua;
    }
    public int getGiaBan(){
        return GiaBan;
    }
    public void GiaMua(int GiaMua){
        this.GiaMua = Math.max(0, GiaMua);
    }
    public void GiaBan(int GiaBan){
        this.GiaBan = Math.max(0, GiaBan);
    }
    public int loiNhuan(){
        return this.GiaBan - this.GiaMua;
    }
    public void showInfo(){
        System.out.printf("%s %s %s %d %d %d\n", this.MaMH, this.TenMH, this.DonViTinh, this.GiaMua, this.GiaBan, this.loiNhuan());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String MaMH = sc.nextLine();
        String TenMH = sc.nextLine();
        String DonViTinh = sc.nextLine();
        int GiaMua = sc.nextInt();
        int GiaBan = sc.nextInt();
        MatHang mh = new MatHang(MaMH, TenMH, DonViTinh, GiaMua, GiaBan);
        mh.showInfo();
        sc.nextLine();
        String MaMH1 = sc.nextLine();
        String TenMH1 = sc.nextLine();
        String DonViTinh1 = sc.nextLine();
        int GiaMua1 = sc.nextInt();
        int GiaBan1 = sc.nextInt();
        MatHang mh1 = new MatHang(MaMH1, TenMH1, DonViTinh1, GiaMua1, GiaBan1);
        mh1.showInfo();
        mh.showInfo();
        sc.close();

    }
}
