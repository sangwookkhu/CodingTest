package Programmers.Level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class Solution1 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0 && n <= 100000000) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
