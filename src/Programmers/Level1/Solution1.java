package Programmers.Level1;

/*
짝수와 홀수
https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */

public class Solution1 {
    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";

        return answer;
    }
}
