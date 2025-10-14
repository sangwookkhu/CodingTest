package BAEKJOON.반복문;

// 영수증
// https://www.acmicpc.net/problem/25304

import java.util.Scanner;

public class S25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int total = 0;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            total += a * b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}

// 메모리: 17907KB, 시간: 180ms