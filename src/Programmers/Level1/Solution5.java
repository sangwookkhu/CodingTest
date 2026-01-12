package Programmers.Level1;

/*
문자열을 정수로 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/12925

제한 사항
1. s의 길이는 1 이상 5이하입니다.
2. s의 맨앞에는 부호(+, -)가 올 수 있습니다.
3. s는 부호와 숫자로만 이루어져있습니다.
4. s는 "0"으로 시작하지 않습니다.
 */

public class Solution5 {
    public int solution(String s) {
        // 1. s의 길이는 1 이상 5이하입니다.
        if (s == null || s.length() < 1 || s.length() > 5) {
            throw new IllegalArgumentException("s의 길이는 1 이상 5 이하 입니다.");
        }

        // 2 & 3. 부호와 숫자로만 이루어져 있습니다.
        if (!s.matches("^[+-]?[0-9]+$")) {
            throw new IllegalArgumentException("s는 부호와 숫자로만 이루어져야 합니다.");
        }

        // 4. s는 "0"으로 시작하지 않습니다.
        char firstChar = s.charAt(0);
        if (firstChar == '0') {
            throw new IllegalArgumentException("s는 0으로 시작할 수 없습니다.");
        }
        if ((firstChar == '+' || firstChar == '-') && s.length() > 1 && s.charAt(1) == '0') {
            throw new IllegalArgumentException("부호 뒤의 숫자는 0으로 시작할 수 없습니다.");
        }

        return Integer.parseInt(s);
    }
}
