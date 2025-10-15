package BAEKJOON.반복문;

import java.util.Scanner;

public class S25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int numLongs = N / 4;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numLongs; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb.toString());
    }
}

// 메모리: 17608KB, 시간: 176ms