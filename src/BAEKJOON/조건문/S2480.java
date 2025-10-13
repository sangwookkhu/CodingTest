package BAEKJOON.조건문;

// 주사위 세개
// https://www.acmicpc.net/problem/2480

import java.util.Scanner;

public class S2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        int prize = 0;

        // 셋 다 같은 경우
        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + (dice1 * 1000);
        }
        // 2개만 같은 경우
        else if (dice1 == dice2 || dice1 == dice3) {
            prize = 1000 + (dice1 * 100);
        } else if (dice2 == dice3) {
            prize = 1000 + (dice2 * 100);
        }
        // 모두 다른 경우
        else {
            int max = dice1;
            if (dice2 > max) {
                max = dice2;
            }
            if (dice3 > max) {
                max = dice3;
            }
            prize = max * 100;
        }

        System.out.println(prize);
        sc.close();
    }
}

// 메모리: 17732KB, 시간: 172ms