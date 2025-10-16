package BAEKJOON.반복문;

// A + B - 8
// https://www.acmicpc.net/problem/11022

import java.util.Scanner;

public class S11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);
        }

        sc.close();
    }
}

// 메모리: 18984KB, 시간: 228ms