package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class minRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println("Minimum number of elements to remove: " + minRemoval(arr, k));
    }

    public static int minRemoval(int[] arr, int k) {
        int n = arr.length;
        int max_len = 0;
        int left = 0;

        for (int right = 0; right < n; ++right) {
            while (arr[right] - arr[left] > k) {
                left++;
            }
            max_len = Math.max(max_len, right - left + 1);
        }

        return n - max_len;
    }
}