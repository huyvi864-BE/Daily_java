package Dlad;
import java.util.Scanner;
public class J01005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            double N = sc.nextDouble();
            double H = sc.nextDouble();
            for (int j = 1; j < N; j++){
                double ans =  H*Math.sqrt(j/N);
                System.out.printf("%.6f ", ans);
            }
            System.out.println();
        }
        sc.close();
    }
}
