package Inflearn.String;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char X;

        String str2 = "";

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                str2 += Character.toUpperCase(str.charAt(i));
            }
            else str2 += Character.toLowerCase(str.charAt(i));
        }

        System.out.println(str2);
        sc.close();
    }
}
