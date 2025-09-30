package Programmers.Level0;

// 홀짝 구분하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181944?language=java

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        sc.close();
    }
}
