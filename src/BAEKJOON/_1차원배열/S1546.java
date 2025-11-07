package BAEKJOON._1차원배열;

import java.util.Scanner;

public class S1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];

        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }


        int max = 0;

        for(int i = 0; i < N; i++) {
            if(score[i] > max) {
                max = score[i];
            }
        }

        double sum = 0.0;

        for(int i = 0; i < N; i++) {
            sum += ((double)score[i] / max) * 100;
        }

        double avg = sum / N;

        System.out.println(avg);
        sc.close();
    }
}

// 메모리: 18648KB, 시간: 208ms