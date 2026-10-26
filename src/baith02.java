import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class baith02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nv = "00001";
        String name = sc.nextLine();
        String gioi_tinh = sc.nextLine();
        String ngay_sinh = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        ngay_sinh = LocalDate.parse(ngay_sinh, formatter).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String dia_chi = sc.nextLine();
        String  ma_thue = sc.nextLine();
        String ngay_ky = sc.next();
        ngay_ky = LocalDate.parse(ngay_ky, formatter).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print(nv + " " + name + " " + gioi_tinh + " " + ngay_sinh + " " + dia_chi + " " + ma_thue + " " + ngay_ky);
    }
}
