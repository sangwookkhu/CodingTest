package Programmers.Level0;

/*
두 수의 합 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120802
 */

import java.util.Scanner;

public class Solution19 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = solution19.solution(num1, num2);
        System.out.println(answer);

        sc.close();
    }
}
