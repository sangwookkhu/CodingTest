package BAEKJOON.심화;

// 별 찍기 - 7
// https://www.acmicpc.net/problem/2444

import java.util.Scanner;

public class S2444 {
    public static void main(String[] args) {
        int maxStars = 9;

        for (int i = 1; i <= maxStars; i += 2) {
            printStars(i);
        }

        // 감소하는 부분 (7개부터 1개까지)
        for (int i = maxStars - 2; i >= 1; i -= 2) {
            printStars(i);
        }
    }

    private static void printStars(int count) {
        // 공백 출력
        int spaces = (9 - count) / 2;
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }

        // 별 출력
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
