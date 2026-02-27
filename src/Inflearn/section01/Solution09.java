package Inflearn.section01;

import java.util.Scanner;

public class Solution09 {
    public int solution(String str) {
        int answer = 0;

        for(char x : str.toCharArray()){
            if(x >= 48 && x <= 57){
                answer = answer * 10 + (x-48);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution09 s = new Solution09();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
