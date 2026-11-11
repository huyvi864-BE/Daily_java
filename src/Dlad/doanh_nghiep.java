package Dlad;
import javax.swing.*;
import java.util.Scanner;
public class doanh_nghiep {
    public doanh_nghiep(String maDN, String tenDN, int soSV) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i= 0; i < n; i++) {
            String MaDN = sc.nextLine();
            String TenDN = sc.nextLine();
            int SoSV = sc.nextInt();
            sc.nextLine();
            System.out.printf("%s %s %d\n", MaDN, TenDN, SoSV);
            DefaultRowSorter<Object, Object> list = null;
            list.sort();
        }
    }
}