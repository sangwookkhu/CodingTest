package Programmers.Level1.EvenOrOdd;

// Programmers Level1 - 짝수와 홀수
// https://school.programmers.co.kr/learn/courses/30/lessons/12937

import java.util.Scanner;

public class Solution {
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(sol.solution(num));
    }
}