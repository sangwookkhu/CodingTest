package Programmers.Level0;

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
