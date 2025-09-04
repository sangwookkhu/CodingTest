package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181909

import java.util.Arrays;

public class Solution8 {
    class Solution {
        public String[] solution(String my_string) {
            String[] suffixes = new String[my_string.length()];

            for (int i = 0; i < my_string.length(); i++) {
                suffixes[i] = my_string.substring(i);
            }

            Arrays.sort(suffixes);

            return suffixes;
        }
    }
}
