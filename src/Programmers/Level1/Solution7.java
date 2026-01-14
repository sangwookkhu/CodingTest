package Programmers.Level1;

/*
정수 내림차순으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/12933

제한 사항
1. n은 1이상 8000000000 이하인 자연수입니다.
 */

import java.util.Arrays;
import java.util.Collections;

public class Solution7 {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");

        Arrays.sort(strArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String s : strArr) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }
}
