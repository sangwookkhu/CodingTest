package Programmers.Level0;

/*
양꼬치
https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */

public class Solution21 {
    public int solution(int n, int k) {
        int serviceDrinks = n / 10;
        int answer = (12000 * n) + (2000 * k) - (2000 * serviceDrinks);

        return answer;
    }
}
