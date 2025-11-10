package BAEKJOON.문자열;

// 상수
// https://www.acmicpc.net/problem/2908

import java.util.Scanner;

public class S2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String reverse_str1 = new StringBuilder(str1).reverse().toString();
        String reverse_str2 = new StringBuilder(str2).reverse().toString();

        int reverse1 = Integer.parseInt(reverse_str1);
        int reverse2 = Integer.parseInt(reverse_str2);

        if(reverse1 > reverse2){
            System.out.print(reverse1);
        }
        else {
            System.out.print(reverse2);
        }

        sc.close();
    }
}

// 메모리: 17552KB, 시간: 164ms