package Programmers.Level0;

/*
뒤집힌 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */

public class Solution25 {
    public String solution(String my_string) {
        String answer = new StringBuilder(my_string).reverse().toString();
        return answer;
    }
}
