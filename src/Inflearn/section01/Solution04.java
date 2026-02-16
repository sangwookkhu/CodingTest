package Inflearn.section01;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution04 {
    // sol 1
//    public ArrayList<String> solution(int n, String[] str){
//        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }

    // sol 2
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while(lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution04 s = new Solution04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for(String x : s.solution(n, str)) {
            System.out.println(x);
        }
    }
}
