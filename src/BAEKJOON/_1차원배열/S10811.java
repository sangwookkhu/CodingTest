package BAEKJOON._1차원배열;

// 바구니 뒤집기
// https://www.acmicpc.net/problem/10811

import java.util.Scanner;

public class S10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];
        for (int k = 0; k < N; k++) {
            baskets[k] = k + 1;
        }

        for (int l = 0; l < M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int start = i - 1;
            int end = j - 1;

            while (start < end) {
                int temp = baskets[start];

                baskets[start] = baskets[end];
                baskets[end] = temp;

                start++;
                end--;
            }
        }

        for (int k = 0; k < N; k++) {
            System.out.print(baskets[k] + " ");
        }

        sc.close();
    }
}

// 메모리: 18528KB, 시간: 204ms