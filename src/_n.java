import java.util.Scanner;

public class _n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>= -n; i--){
            System.out.print(i + " ");
        }
    }
}