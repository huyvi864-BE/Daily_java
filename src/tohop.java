import java.util.Scanner;
public class tohop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 1;
        for (int i = 0; i < k; i++){
            result *= (n - i);
            result /= (i + 1);
        }
        System.out.println("Tong cong co "+ result+ " to hop");
    }
}