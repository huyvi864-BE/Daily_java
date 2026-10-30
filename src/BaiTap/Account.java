package BaiTap;

public class Account {
    private long soTK;
    private String tenTK;
    private double money;
    private final double laiSuat = 0.035;

    public Account(){}

    public Account (long soTK, String tenTK){
        this.soTK =soTK;
        this.tenTK = tenTK;
        this.money = 50;

    }
    public Account (long soTK, String tenTK, double money) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.money = Math.max(50,money);
    }
    public double getMoney(){
        return this.money;
    }
    public void napTien(double tienNap){
        if (tienNap> 0){
            this.money += tienNap;
        }
    }
    public void rutTien(double tienRut, double phiRut){
        if (tienRut > 0 && (tienRut+ phiRut) <= this.money){
            this.money -= (tienRut + phiRut);
        }
    }
    public void daoHan(){
        this.money += this.money*laiSuat;
    }
    public void chuyenKhoan(Account tkNhan, double tienChuyen){
        if (tienChuyen > 0 &&  tienChuyen <= this.money){
            this.money -= tienChuyen;
            tkNhan.napTien(tienChuyen);
        }
    }
    public void showInfo(){
        System.out.printf("%-10d %-18s % ,.0f VND\n", this.soTK, this.tenTK, this.money);
    }

}
class bai04{
    public static void main(String[] args){
        Account t1 = new Account(123456789, "Nguyen Van A", 1000000);
        Account t2 = new Account(987654321, "Nguyen Van B", 500000);
        Account t3 = new Account(456789123, "Nguyen Van C" , 0);
        t1.napTien(500000);
        t1.rutTien(200000, 5000);
        t3.daoHan();
        t1.chuyenKhoan(t2, 500000 );
        t3.napTien(100000);

        System.out.println("==== Thong tin tai khoan ====");
        System.out.printf("%-10s %-18s %-10s\n", "So TK", "Ten TK", "So du");
        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
    }
}
