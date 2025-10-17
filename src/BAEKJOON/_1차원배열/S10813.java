package BAEKJOON._1차원배열;

// 공 바꾸기
// https://www.acmicpc.net/problem/10813

import java.util.Scanner;

public class S10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N + 1];

        for (int k = 1; k <= N; k++) {
            baskets[k] = k;
        }

        for (int count = 0; count < M; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        for (int k = 1; k <= N; k++) {
            System.out.print(baskets[k] + (k == N ? "" : " "));
        }

        sc.close();
    }
}

// 메모리: 18776KB, 시간: 216ms