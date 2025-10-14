package BAEKJOON.조건문;

// 알람시계
// https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class S2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int newM = M - 45;
        int newH = H;

        if (newM < 0) {
            newH = H - 1;
            newM = 60 + newM;

            if (newH < 0) {
                newH = 23;
            }
        }

        System.out.println(newH + " " + newM);

        sc.close();
    }
}

// 메모리: 18576KB, 시간: 196ms