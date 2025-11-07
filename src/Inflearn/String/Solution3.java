package Inflearn.String;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int x = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for(int i = 0; i < s.length; i++){
            if(s[i].length()>x){
                x = Integer.parseInt(s[i]);
            }
        }

        System.out.println(x);
        sc.close();

    }
}
