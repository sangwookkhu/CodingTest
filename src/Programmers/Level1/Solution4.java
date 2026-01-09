package Programmers.Level1;

/*
Level1
나머지가 1이 되는 수 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */

public class Solution4 {
    public int solution(int n) {

        // 1. 3 <= n <= 1,000,000 이 아닌 경우 예외처리
        if(n < 3 || n > 1000000) {
            throw new IllegalArgumentException("n은 3이상 1000000이하여야 합니다.");
        }

        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
