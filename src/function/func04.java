package function;

import java.util.Scanner;

public class func04 {
    public static int max3(int a, int b, int c){
        if (a >= b && a >=c){
            return a;
        } else if( b >=c){
            return b;
        }else {
            return c;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(max3(a, b, c));
    }
}