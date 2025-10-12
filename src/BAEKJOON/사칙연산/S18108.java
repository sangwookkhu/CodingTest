package BAEKJOON.사칙연산;

// 1998년생인 내가 태국에서는 2541년생?!
// https://www.acmicpc.net/problem/18108

import java.util.Scanner;

public class S18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.println(year - 543);

        sc.close();
    }
}

// 메모리: 17736KB, 시간 176ms