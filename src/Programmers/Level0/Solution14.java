package Programmers.Level0;

// 원소들의 곱과 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181929

// 기억할것 : Math.pow(n, a); => n의 a 제곱


public class Solution14 {
    public int solution(int[] num_list) {
        int answer = 0;

        int mul = 1;
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }

        if(mul < Math.pow(sum, 2)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();

        System.out.println(s.solution(new int[]{1,2,3,4,5}));
        System.out.println(s.solution(new int[]{5, 7, 8, 3}));
    }
}
