package BAEKJOON.string.find_alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < 26; i++) {
            char C = (char)('a' + i);

            int index = str.indexOf(C);

            System.out.print(index + " ");
        }

    }
}
