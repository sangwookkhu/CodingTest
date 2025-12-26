package Programmers.Level0;

/*
몫 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120805?language=java
 */

import java.util.Scanner;

public class Solution18 {
    public int solution(int num1, int num2) {
        int answer = 0;

        answer = num1 / num2;

        return answer;
    }

    public static void main(String[] args) {
        Solution18 s = new Solution18();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = s.solution(num1, num2);
        System.out.println(answer);

        sc.close();
    }
}
