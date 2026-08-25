import java.util.Scanner;
 class tang_giam {
public static void main(String[] arsg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a <= b && b <= c) {
        System.out.println("increasing");
    } else if (a >= b && b >= c){
        System.out.println("decreasing");
    } else {
        System.out.println("neither increasing nor decreasing order");
    }
}}