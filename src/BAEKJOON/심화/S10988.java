package BAEKJOON.심화;

// 팰린드롬인지 확인하기
// https://www.acmicpc.net/problem/10988

import java.util.Scanner;

public class S10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? 1 : 0);
        sc.close();
    }
}

// 메모리: 17588KB, 시간: 172ms