package BAEKJOON._1차원배열;

// X보다 작은 수
// https://www.acmicpc.net/problem/10871

import java.util.Scanner;

public class S10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();

            if (A < X) {
                System.out.print(A + " ");
            }
        }

        System.out.println();

        sc.close();
    }
}

// 메모리: 31864KB, 시간: 520KB