package Programmers.Level0;

/*
두 수의 나눗셈
https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */

import java.util.Scanner;

public class Solution17 {

    public int solution(int num1, int num2) {
        int answer = 0;

        answer = (int)((double)num1 / num2 * 1000);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Solution17 sol = new Solution17();

        int answer = sol.solution(num1, num2);
        System.out.println(answer);

        sc.close();
    }
}
