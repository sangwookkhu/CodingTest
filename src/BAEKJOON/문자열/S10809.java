package BAEKJOON.문자열;

// 알파벳 찾기
// https://www.acmicpc.net/problem/10809

import java.util.Scanner;

public class S10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < 26; i++) {
            char C = (char)('a' + i);

            int index = str.indexOf(C);

            System.out.print(index + " ");
        }

        sc.close();
    }
}

// 메모리: 18384KB, 시간: 184ms