package Programmers.Level0;

/*
피자 나눠 먹기(3)
https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */

public class Solution33 {
    public int solution(int slice, int n) {
        int answer = n / slice;

        if (n % slice != 0) {
            answer++;
        }

        return answer;
    }
}
