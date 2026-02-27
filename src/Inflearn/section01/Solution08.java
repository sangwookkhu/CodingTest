package Inflearn.section01;

import java.util.Scanner;

public class Solution08 {
    public String solution(String str) {
        String answer = "No";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution08 s = new Solution08();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(s.solution(str));
    }
}
