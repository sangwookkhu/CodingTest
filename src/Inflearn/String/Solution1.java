package Inflearn.String;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char X = sc.next().charAt(0);

        str = str.toUpperCase();
        X = Character.toUpperCase(X);

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == X) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}