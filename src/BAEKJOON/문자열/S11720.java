package BAEKJOON.문자열;

// 숫자의 합
// https://www.acmicpc.net/problem/11720

import java.util.Scanner;

public class S11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String numbers = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
        sc.close();
    }
}

// 메모리: 17768KB, 시간: 180ms