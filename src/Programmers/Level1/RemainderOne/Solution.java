package Programmers.Level1.RemainderOne;

import java.util.Scanner;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n < 3 || n > 1000000) {
            throw new IllegalArgumentException("n은 3이상 1000000이하이어야 합니다");
        }

        for (int i = 1; i <= n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            System.out.println(sol.solution(n));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
