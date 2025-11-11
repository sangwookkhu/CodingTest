package BAEKJOON.심화;

import java.util.Scanner;

public class S3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] found = new int[6];

        for (int i = 0; i < 6; i++) {
            found[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(correct[i] - found[i] + " ");
        }

        sc.close();
    }
}

// 메모리: 18316KB, 시간: 188ms