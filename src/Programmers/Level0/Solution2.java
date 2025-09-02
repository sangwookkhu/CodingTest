package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181935

public class Solution2 {
    public int solution(int n) {
        int answer = 0;

        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) { // 홀수일 경우
                for (int i = 1; i <= n; i += 2) {
                    answer += i;
                }
            } else { // 짝수일 경우
                for (int i = 2; i <= n; i += 2) {
                    answer += i * i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(7));   // 16
        System.out.println(s.solution(10));  // 220
    }
}