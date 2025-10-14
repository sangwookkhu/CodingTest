package BAEKJOON.반복문;

// 구구단
// https://www.acmicpc.net/problem/2739

import java.util.Scanner;

public class S2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }

        sc.close();
    }
}

// 메모리: 18512KB, 시간: 200ms