package Strings;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = 0;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                res++;
            }
        }
        System.out.print(res);
    }
}