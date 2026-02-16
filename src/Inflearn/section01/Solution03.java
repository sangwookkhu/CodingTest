package Inflearn.section01;

import java.util.Scanner;

public class Solution03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution03 s = new Solution03();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(s.solution(str));
    }
}
