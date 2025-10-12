package BAEKJOON.조건문;

// 윤년
// https://www.acmicpc.net/problem/2753

import java.util.Scanner;

public class S2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int answer = 0;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            answer = 1;
        else answer = 0;

        System.out.println(answer);
        sc.close();
    }
}

// 메모리: 17720KB, 시간: 168ms