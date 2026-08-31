import java.util.Scanner;

public class n_giaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            // answer *= i tương đương với answer = answer * i;
            answer *= i;
        }
        System.out.print(answer);
    }
}
