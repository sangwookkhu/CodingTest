package BAEKJOON.array1d.공바꾸기_10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n + 1];

        for (int k = 1; k <= n; k++) {
            baskets[k] = k;
        }

        for (int count = 0; count < m; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        for (int k = 1; k <= n; k++) {
            System.out.print(baskets[k] + (k == n ? "" : " "));
        }

        sc.close();
    }
}
