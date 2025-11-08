package BAEKJOON.문자열;

// 아스키 코드
// https://www.acmicpc.net/problem/11654

import java.util.Scanner;

public class S11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char C =  sc.next().charAt(0);

        System.out.println((int)C);
        sc.close();
    }
}

// 메모리: 17624KB, 시간: 168ms