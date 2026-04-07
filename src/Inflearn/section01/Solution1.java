package Inflearn.section01;

import java.util.Scanner;

// 1. 문자 찾기
public class Solution1 {
    public int solution(String str, char c) {
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        Solution1 sol = new Solution1();
        System.out.println(sol.solution(str, c));
    }
}
