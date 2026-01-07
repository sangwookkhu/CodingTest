package Programmers.Level0;

/*
최댓값 만들기(1)
https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */


import java.util.Arrays;

public class Solution29 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length;
        return numbers[n - 1] * numbers[n - 2];
    }
}
