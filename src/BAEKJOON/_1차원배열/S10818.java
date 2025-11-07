package BAEKJOON._1차원배열;

// https://www.acmicpc.net/problem/10818

import java.util.Scanner;

public class S10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < N; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
        sc.close();
    }
}

// 메모리: 318264KB, 시간: 1580ms