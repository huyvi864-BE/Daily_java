package Strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int k =sc.nextInt();
        System.out.print(s.charAt(k-1));
    }
}