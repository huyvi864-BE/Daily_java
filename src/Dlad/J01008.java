package Dlad;
import java.util.Scanner;
public class J01008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");

            for (int j = 2; j <= Math.sqrt(n); j++){
                int count = 0;
                while (n% j ==0){
                    count++;
                    n/= j;
                }
                if (count > 0){
                    System.out.print(j + "(" + count + ") ");
                }
            }
            if (n > 1){
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}
