package BAEKJOON.반복문;

// A + B - 7
// https://www.acmicpc.net/problem/11021

import java.util.Scanner;

public class S11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;

            System.out.println("Case #" + i + ": " + sum);
        }

        sc.close();
    }
}

// 메모리: 18644KB, 시간: 220ms