package Programmers.Level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181907

import java.util.Scanner;

public class Solution3 {
    public String solution (String my_string, int n) {
        String answer = "";

        if(my_string.length() >= 1 && my_string.length() <= 1000 && n >= 1 && n <= my_string.length()) {
            answer = my_string.substring(0, n);;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();

        System.out.println(s.solution("ProgrammerS123", 11));
        System.out.println(s.solution("He110W0r1d", 5));
    }
}
