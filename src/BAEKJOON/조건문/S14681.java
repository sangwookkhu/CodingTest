package BAEKJOON.조건문;

// 사분면 고르기
// https://www.acmicpc.net/problem/14681

import java.util.Scanner;

public class S14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int square;

        if(x > 0 && y > 0) square = 1;
        else if(x < 0 && y > 0) square = 2;
        else if(x <0 && y < 0) square = 3;
        else square = 4;

        System.out.println(square);
        sc.close();
    }
}

// 메모리: 17684KB, 시간 172ms
