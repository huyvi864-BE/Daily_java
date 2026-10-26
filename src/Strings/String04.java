package Strings;

import java.util.Scanner;
public class String04{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(s.indexOf(c) + " " + s.lastIndexOf(c));
        sc.close();
    }
}