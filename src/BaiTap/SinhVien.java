package BaiTap;

public class SinhVien {
    private int Msv;
    private String name;
    private float  diemLT, diemTH;

    public SinhVien(){
        this.Msv = 0;
        this.name = "";
        this.diemTH = 0;
        this.diemLT = 0;
    }

    public SinhVien(int Msv, String name, float diemLT, float diemTH){
        this.Msv = Msv;
        this.name =name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMsv(){
        return Msv;
    }
    public void setMsv(int Msv){
        this.Msv = Msv;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getDiemTH(){
        return diemTH;
    }
    public void setDiemTH(float diemTH){
        this.diemTH = Math.max(0,diemTH);
    }
    public float getDiemTL(){
        return diemLT;
    }
    public void setDiemLT(float diemLT){
        this.diemLT = Math.max(0,diemLT);
    }
    public float diemTB(){
        return (this.diemLT + this.diemTH)/2;
    }
    public void showInfo(){
        System.out.printf("%-6d %-18s %-8.2f %-8.2f %-8.2f\n", this.Msv, this.name, this.diemLT, this.diemTH, this.diemTB());
    }

}
class Bai02{
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien(001, "Nguyen Van A", 8.5f, 7.5f);
        SinhVien sv2 = new SinhVien( 002, "Nguyen Van B", 6.5f, 5.5f);
        SinhVien sv3 = new SinhVien();
        sv3.setMsv(003);
        sv3.setName( "Nguyen Van c" );
        sv3.setDiemTH(7.5f);
        sv3.setDiemLT(8.0f);

        System.out.println("=====Danh sach sinh vien=====");
        System.out.printf("%-6s %-18s %-8s %-8s %-8s\n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");

        sv1.showInfo();
        sv2.showInfo();
        sv3.showInfo();
    }
}
