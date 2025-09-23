package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; // main 함수에서 결과 출력을 위해 추가

public class Solution12 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        answer.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            answer.add(n);
        }

        int[] new_answer = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            new_answer[i] = answer.get(i);
        }

        return new_answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int n = 10;
        int[] result = s.solution(n);

        System.out.println(Arrays.toString(result));
    }
}