package BAEKJOON._1차원배열;

// 나머지
// https://www.acmicpc.net/problem/3052

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            remainders.add(num % 42);
        }

        System.out.println(remainders.size());
        sc.close();
    }
}

// 메모리: 17660KB, 시간: 172ms