package Programmers.Level1.StringToInt;

import java.util.Scanner;

public class Solution {
    public int solution(String s) {
        // 1. s의 길이는 1이상 5이하입니다.
        if(s.length() < 1 || s.length() > 5) {
            throw new IllegalArgumentException();
        }

        // 2 & 3. s의 맨앞에는 부호, s는 부호와 숫자로만 이루어져 있습니다.
        if (!s.matches("^[+-]?[0-9]+$")) {
            throw new IllegalArgumentException("s는 부호와 숫자로만 이루어져야 합니다.");
        }

        // 4. s는 "0"으로 시작하지 않습니다.
        char firstChar = s.charAt(0);
        if (firstChar == '0') {
            throw new IllegalArgumentException("s는 0으로 시작할 수 없습니다.");
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

        try {
            String str = sc.next();
            System.out.println(s.solution(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
