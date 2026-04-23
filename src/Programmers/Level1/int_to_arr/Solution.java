package Programmers.Level1.int_to_arr;

// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932

public class Solution {
    public int[] solution(long n) {

        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return answer;
    }
}
