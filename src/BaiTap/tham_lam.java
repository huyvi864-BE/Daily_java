package BaiTap;

import java.util.Arrays;

public class tham_lam {
    public static int numberOfToys(int[] arr, int k) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k -= arr[i];
                res++;
            } else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int k1 = 4;
        System.out.println("Ví dụ 1 - So do choi mua duoc: " + numberOfToys(arr1, k1));

        int[] arr2 = {5, 6, 2, 9, 7, 10, 7};
        int k2 = 2;
        System.out.println("Ví dụ 2 - So do choi mua duoc: " + numberOfToys(arr2, k2));
    }
}