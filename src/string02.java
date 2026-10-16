import java.util.Scanner;

public class string02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int res =0;
        for (char i : s.toCharArray()){
            if(i == c){
                res +=1;
            }
        }
        System.out.print(res);
    }
}