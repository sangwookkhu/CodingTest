package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181899

import java.util.Arrays;

public class Solution5 {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1;
        int[] answer = new int[size];

        for(int i = 0; i < size; i++) {
            answer[i] = start_num - i;
        }

        return answer;
    }
}
