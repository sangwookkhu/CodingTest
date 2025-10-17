package BAEKJOON._1차원배열;

// 개수 세기
// https://www.acmicpc.net/problem/10807

import java.util.Scanner;

public class S10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

// 메모리: 17852KB, 시간: 180ms