package BAEKJOON.array1d.공넣기_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n + 1];

        for (int count = 0; count < m; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = i; l <= j; l++) {
                baskets[l] = k;
            }
        }

        for (int l = 1; l <= n; l++) {
            System.out.print(baskets[l] + (l == n ? "" : " "));
        }

        sc.close();
    }
}
