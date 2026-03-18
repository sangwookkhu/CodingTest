package BAEKJOON.array1d.smallThanX;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), x = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int ans = sc.nextInt();

            if(ans < x) System.out.print(ans + " ");
        }
    }
}