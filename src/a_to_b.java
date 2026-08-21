import java.util.Scanner;

public class a_to_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}