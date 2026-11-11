package Dlad;

import java.util.Scanner;

public class J01013 {
    static int[] spf = new int[2000005];

    public static void sieve() {
        for (int i = 2; i <= 2000000; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= 2000000; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= 2000000; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        sieve();

        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            while (x > 1) {
                totalSum += spf[x];
                x /= spf[x];
            }
        }

        System.out.println(totalSum);
        sc.close();
    }
}