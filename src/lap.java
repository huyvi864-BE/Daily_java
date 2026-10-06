import java.util.Scanner;

public class lap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n <= 100) {
            if(n % 2 ==0){
                System.out.print(n + " ");
            }
            n++;
        }
    }
}