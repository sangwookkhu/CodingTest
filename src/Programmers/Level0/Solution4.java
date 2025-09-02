package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181933

public class Solution4 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();

        System.out.println(s.solution(-4, 7, true));
        System.out.println(s.solution(-4, 7, false));
    }
}
