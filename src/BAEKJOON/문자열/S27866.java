package BAEKJOON.문자열;

// 문자와 문자열
// https://www.acmicpc.net/problem/27866

import java.util.Scanner;

public class S27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int X = sc.nextInt();

        System.out.println(str.charAt(X-1));
        sc.close();
    }
}

// 메모리: 17736KB, 시간: 168ms