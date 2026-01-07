package Programmers.Level0;

/*
머쓱이보다 키 큰 사람
https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */

public class Solution30 {
    public int solution(int[] array, int height) {
        int n = array.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(array[i] > height) count++;
        }

        return count;
    }
}
