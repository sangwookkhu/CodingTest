package BAEKJOON.조건문;

// 오븐 시계
// https://www.acmicpc.net/problem/2525

import java.util.Scanner;

public class S2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B = B + C;

        if (B >= 60) {
            A += B / 60;
            B = B % 60;
        }

        if (A >= 24) {
            A = A - 24;
        }

        System.out.println(A + " " + B);

        sc.close();
    }
}

// 메모리: 18452KB, 시간: 188ms