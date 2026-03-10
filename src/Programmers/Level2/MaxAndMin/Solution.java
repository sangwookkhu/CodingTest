package Programmers.Level2.MaxAndMin;

// Programmers.Level2 - 최댓값과 최솟값

import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for (String ans : str) {
            int num = Integer.parseInt(ans);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc =  new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
