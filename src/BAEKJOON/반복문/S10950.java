package BAEKJOON.반복문;

// A + B - 3
// https://www.acmicpc.net/problem/10950

import java.util.Scanner;

public class S10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }

        sc.close();
    }
}

// 메모리: 17892KB, 시간: 192ms