import java.util.Scanner;

public class so_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;
        for (int i=0; i <= a; i++ ){
            if (i % 2 !=0){
                res += i;}
        }
        System.out.print(res);
    }
}