package Programmers.Level1;

/*
x만큼 간격이 있는 n개의 숫자
https://school.programmers.co.kr/learn/courses/30/lessons/12954

제한 사항
1. x는 -10000000 이상, 10000000 이하인 정수입니다.
2. n은 1000 이하인 자연수입니다.
 */

import java.util.Scanner;

import java.util.Scanner;

public class Solution3 {
    public long[] solution(int x, int n) {
        if (x < -10000000 || x > 10000000) {
            throw new IllegalArgumentException("x는 -10,000,000에서 10,000,000 사이여야 합니다. (입력값: " + x + ")");
        }
        if (n <= 0 || n > 1000) {
            throw new IllegalArgumentException("n은 1에서 1,000 사이의 자연수여야 합니다. (입력값: " + n + ")");
        }

        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("x 입력: ");
            int x = sc.nextInt();

            System.out.print("n 입력: ");
            int n = sc.nextInt();

            long[] result = sol.solution(x, n);

            System.out.print("결과: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i == result.length - 1 ? "" : ", "));
            }

        } catch (IllegalArgumentException e) {
            System.err.println("[입력 오류] " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[시스템 오류] 잘못된 입력 형식이거나 알 수 없는 오류가 발생했습니다.");
        } finally {
            sc.close();
        }
    }
}