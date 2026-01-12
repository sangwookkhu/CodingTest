package Programmers.Level0;

/*
순서쌍의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */

public class Solution36 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
