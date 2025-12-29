package Programmers.Level0;

/*
배열의 평균값
https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */

public class Solution23 {
    class Solution {
        public double solution(int[] numbers) {
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            double answer = (double) sum / numbers.length;

            return answer;
        }
    }
}
