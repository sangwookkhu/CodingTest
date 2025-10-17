package BAEKJOON._1차원배열;

// 공 넣기
// https://www.acmicpc.net/problem/10810

import java.util.Scanner;

public class S10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N + 1];

        for (int count = 0; count < M; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = i; l <= j; l++) {
                baskets[l] = k;
            }
        }

        for (int l = 1; l <= N; l++) {
            System.out.print(baskets[l] + (l == N ? "" : " "));
        }

        sc.close();
    }
}

// 메모리: 18960KB, 시간: 216ms