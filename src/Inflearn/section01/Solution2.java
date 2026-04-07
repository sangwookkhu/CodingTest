package Inflearn.section01;

import java.util.Scanner;

public class Solution2 {
    public String solution(String str){
        String answer="";

        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Solution2 sol = new Solution2();
        System.out.println(sol.solution(str));
    }
}
