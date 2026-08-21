import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a>=c){
            System.out.print(a);
        } else if (b>= c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}