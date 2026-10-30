package BaiTap;
public class HinhChuNhat{
    private double dai;
    private double rong;

    public HinhChuNhat(){}

    public HinhChuNhat(double dai, double rong){
        this.dai= Math.max(0,dai);
        this.rong =Math.max(0,rong);
    }
    public double getDai(){
        return dai;
    }
    public double getRong(){
        return rong;
    }
    public void setDai(double dai){
        this.dai = Math.max(0, dai);
    }
    public void setRong(double rong){
        this.rong = Math.max(0,rong);
    }
    public double chuVi(){
        return (dai+rong)*2;
    }
    public double dienTich(){
        return dai*rong;
    }
    public void showInfo(){
        System.out.printf("Hinh chu nhat co chieu dai %.2f, chieu rong %.2f, chu vi %.2f, dien tich %.2f\n", this.dai, this.rong, this.chuVi(), this.dienTich());
    }
}
class Bai01{
    public static void main(String[]args){
        HinhChuNhat h1 = new HinhChuNhat(10,  5);
        HinhChuNhat h2 = new HinhChuNhat();
        h2.setDai(8.5);
        h2.setRong(5);
        h1.showInfo();
        h2.showInfo();

    }
}
