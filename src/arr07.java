import java.util.Scanner;

public class arr07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = 0;
        for (int i =0; i <n; i++){
            if(arr[i] == k){
                res += 1;
            }
        }
        System.out.print(res);
    }
}
