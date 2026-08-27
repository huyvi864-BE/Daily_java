import java.util.Scanner;

public class res {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res =0;
        for (int i =a; i<=b; i++){
            res += i;
        }
        System.out.print(res);
    }
}
