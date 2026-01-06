package Programmers.Level1;

/*
평균 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java

제한사항
1. arr은 길이 1 이상, 100 이하인 배열입니다.
2. arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
*/

public class Solution2 {
    public double solution(int[] arr) {
        // 1. 배열 길이 예외 처리 (1 이상 100 이하)
        if (arr == null || arr.length < 1 || arr.length > 100) {
            throw new IllegalArgumentException("배열의 길이는 1 이상 100 이하이어야 합니다.");
        }

        double answer = 0;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // 2. 원소 값 범위 예외 처리 (-10,000 이상 10,000 이하)
            if (arr[i] < -10000 || arr[i] > 10000) {
                throw new IllegalArgumentException("원소는 -10,000 이상 10,000 이하의 정수여야 합니다.");
            }
            sum += arr[i];
        }

        answer = (double) sum / arr.length;
        return answer;
    }
}