package Inflearn.section01;

import java.util.Scanner;

public class Solution07 {
    // 일반적인 방법
//    public String solution(String str) {
//        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for(int i = 0; i < len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                answer = "NO";
//            }
//        }
//
//        return answer;
//    }

    // StringBuilder 사용
    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution07 s = new Solution07();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(s.solution(str));
    }
}