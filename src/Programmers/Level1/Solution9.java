package Programmers.Level1;

/*
정수 제곱근 판별
https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */

public class Solution9 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (sqrt == (long)sqrt) {
            long x = (long)sqrt;
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
