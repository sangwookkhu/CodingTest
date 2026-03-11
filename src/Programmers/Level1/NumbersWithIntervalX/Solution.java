package Programmers.Level1.NumbersWithIntervalX;

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public long[] solution(int x, int n) {
        if (x < -10000000 || x > 10000000) {
            throw new IllegalArgumentException("x는 -10,000,000 이상 10,000,000 이하이어야 합니다.");
        }
        if (n < 1 || n > 1000) {
            throw new IllegalArgumentException("n은 1 이상 1000 이하의 자연수여야 합니다.");
        }

        long[] arr = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = (long)x * (i + 1);
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(Arrays.toString(solution.solution(x, n)));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}