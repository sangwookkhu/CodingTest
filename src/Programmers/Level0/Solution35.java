package Programmers.Level0;

/*
배열의 유사도
https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */

public class Solution35 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        int length1 = s1.length;
        int length2 = s2.length;

        for(int i = 0; i < length1; i++) {
            for(int j = 0; j < length2; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
