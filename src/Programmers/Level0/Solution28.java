package Programmers.Level0;

/*
세균 증식
https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */

public class Solution28 {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
