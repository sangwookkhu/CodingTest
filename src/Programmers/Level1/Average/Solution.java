package Programmers.Level1.Average;

// Programmers.Level1 - 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

import java.util.Scanner;

public class Solution {
    public double solution(int[] arr) {
        if(arr.length < 1 || arr.length > 100) {
            throw new IllegalArgumentException("배열의 길이는 1이상 100이하이어야 합니다.");
        }
        int len = arr.length;
        int sum = 0;

        for(int n : arr) {
            if(n < -10000 || n > 10000) {
                throw new IllegalArgumentException("원소의 값은 -10000 이상 10000이하이어야 합니다.");
            }

            sum += n;
        }

        double avg = (double)sum / len;

        return avg;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(sol.solution(arr));
        } catch (IllegalArgumentException e) {
            System.err.println("제약 조건 위반: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}