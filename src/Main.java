import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        while (a-- > 0) {
            long b = sc.nextLong();
            System.out.println((b*(b+1))/2);
        }
        sc.close();
    }
}
