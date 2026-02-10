package Inflearn.section01;

import java.util.Scanner;

public class Solution01 {
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c) {
//                answer++;
//            }
//        }

        for(char x : str.toCharArray()){
            if(x == c){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.print(s.solution(str, c));
    }
}