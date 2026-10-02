import java.util.Scanner;
public class bai02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for (int i=0; i<a; i++){
            long b = sc.nextLong();
            System.out.println(b*(b+1)/2);
        }
        sc.close();
    }
}



