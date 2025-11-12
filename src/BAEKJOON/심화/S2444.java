package BAEKJOON.심화;

// 별 찍기 - 7
// https://www.acmicpc.net/problem/2444

import java.util.Scanner;

public class S2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i += 2) {
            printStars(i, n);
        }

        for (int i = 2 * n - 3; i >= 1; i -= 2) {
            printStars(i, n);
        }

        sc.close();
    }

    private static void printStars(int count, int n) {
        int spaces = (2 * n - 1 - count) / 2;
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// 메모리: 23588KB, 시간: 460ms