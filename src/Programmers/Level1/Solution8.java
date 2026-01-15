package Programmers.Level1;

/*
하샤드의 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

제한 사항
1. 1 <= x <= 10,000
 */

public class Solution8 {
    public boolean solution(int x) {
        if (x < 1 || x > 10000) {
            throw new IllegalArgumentException("입력값은 1 이상 10,000 이하의 정수여야 합니다.");
        }

        int originalX = x;
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return originalX % sum == 0;
    }
}
