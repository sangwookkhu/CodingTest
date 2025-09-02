package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181946

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String answer = " ";

        if(a.length() >= 0 && a.length() <= 10 && b.length() >= 0 && b.length() <= 10) {
            answer = a + b;
        }

        System.out.println(answer);
    }
}
