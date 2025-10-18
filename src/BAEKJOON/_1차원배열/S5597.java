package BAEKJOON._1차원배열;

// 과제 안 내신 분..?
// https://www.acmicpc.net/problem/5597

import java.util.Scanner;

public class S5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int studentNum = sc.nextInt();
            submitted[studentNum] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

// 메모리: 17712KB, 시간: 172ms
