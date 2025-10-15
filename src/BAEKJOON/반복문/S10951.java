package BAEKJOON.반복문;

// A + B - 4
// https://www.acmicpc.net/problem/10951

import java.util.Scanner;

public class S10951 {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        while(sc.hasNextInt()){

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);

        }
        sc.close();
    }
}

// 메모리: 17860KB, 시간: 188ms