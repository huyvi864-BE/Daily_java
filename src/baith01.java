import java.util.Scanner;
public class baith01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< n-1; i++){
            boolean isSwapped = false;
            for(int j =0; j< n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
