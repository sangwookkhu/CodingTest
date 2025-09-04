package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181911

public class Solution9 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];

            answer.append(str.substring(start, end + 1));
        }

        return answer.toString();
    }
}
