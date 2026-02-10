package Inflearn.section01;

import java.util.Scanner;

public class Solution02 {
    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution02 s = new Solution02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
