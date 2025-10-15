package BAEKJOON.반복문;

// 별 찍기 - 1
// https://www.acmicpc.net/problem/2438

import java.util.Scanner;

public class S2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

// 메모리: 18080KB, 시간: 232ms