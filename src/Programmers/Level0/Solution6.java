package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181901

public class Solution6 {
    public int[] solution(int n, int k) {

        int size = n / k;
        int[] answer = new int[size];
        int index = 0;

        for (int i = k; i <= n; i += k) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}