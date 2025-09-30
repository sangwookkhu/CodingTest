package Programmers.Level0;

// 콜라츠 수열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181919

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
    public int[] solution(int n) {
        long currentNum = (long) n;
        List<Long> sequence = new ArrayList<>();

        sequence.add(currentNum);

        while (currentNum != 1) {
            if (currentNum % 2 == 0) {
                currentNum /= 2;
            } else {
                currentNum = 3 * currentNum + 1;
            }

            sequence.add(currentNum);
        }

        int[] result = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            result[i] = (int) sequence.get(i).longValue();
        }

        return result;
    }
}
