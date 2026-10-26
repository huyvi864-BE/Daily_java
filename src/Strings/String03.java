package Strings;

import java.util.Scanner;
public class String03{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        int res = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                res = i;
                break;
            }
        }
        System.out.print(res);
    }
}