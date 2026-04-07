package BAEKJOON.string.string_repetition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int repeat = sc.nextInt();
            String str = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                for(int k = 0; k < repeat; k++) {
                    sb.append(ch);
                }
            }

            System.out.println(sb.toString());
        }
    }
}
