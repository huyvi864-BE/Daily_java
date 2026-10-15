import java.util.Scanner;

public class mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i< n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res =0;
        for(int i = 0; i <n; i++){
            for (int j= 0; j< m; j++){
                res += arr[i][j];
            }
        }
        System.out.print(res);
    }
}