package Programmers.Level0;

/*
삼각형의 완성조건(1)
https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */

import java.util.Arrays;

public class Solution31 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        int len = sides[0] + sides[1];

        if(sides[2] >= len) answer = 2;
        else answer = 1;

        return answer;
    }
}
