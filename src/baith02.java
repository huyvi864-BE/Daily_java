import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class baith02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma_sv = "B20DCCN001";
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ngay_sinh = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        ngay_sinh = LocalDate.parse(ngay_sinh, formatter).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        float gpa = sc.nextFloat();
        if (gpa >= 0 && gpa <= 4) {
            System.out.print(ma_sv + " " + ten + " " + lop + " " + ngay_sinh + " " + String.format("%.2f", gpa) + " ");
        }
    }
}