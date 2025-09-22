package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181936
// 공배수 구하기

public class Solution11 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution11 s = new Solution11();

        System.out.println(s.solution(60, 2, 3));
        System.out.println(s.solution(55, 10, 5));
    }
}
