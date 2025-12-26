package Programmers.Level0;

/*
각도기
https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */

import java.util.Scanner;

public class Solution20 {
    public int solution(int angle) {
        int answer = 0;

        if(angle > 0 && angle < 90){
            answer = 1;
        }
        else if(angle == 90) {
            answer = 2;
        }
        else if(angle > 90 && angle < 180) {
            answer = 3;
        }
        else if(angle == 180) {
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();
        Scanner sc = new Scanner(System.in);

        int angle = sc.nextInt();
        System.out.println(s.solution(angle));

        sc.close();
    }
}
