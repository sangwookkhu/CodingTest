package BAEKJOON.문자열;

// 문자열
// https://www.acmicpc.net/problem/9086

import java.util.Scanner;

public class S9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        sc.nextLine();

        String[] str = new String[X];

        for(int i = 0; i < X; i++) {
            str[i] = sc.nextLine();
        }

        for(int i = 0; i < X; i++) {
            System.out.println(str[i].charAt(0) + "" + str[i].charAt(str[i].length()-1));
        }

        sc.close();
    }
}

// 메모리: 18480KB, 시간: 188ms