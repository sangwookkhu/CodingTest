package Programmers.Level1;

/*
약수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/12928

제한 사항
1. n은 0 이상 3000이하인 정수입니다.
 */

public class Solution6 {
    public int solution(int n) {

        if(n < 0 || n > 3000) {
            throw new IllegalArgumentException("n은 0이상 3000이하인 정수입니다.");
        }
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }

        return answer;
    }
}
