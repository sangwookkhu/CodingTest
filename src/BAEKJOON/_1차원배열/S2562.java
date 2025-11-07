package BAEKJOON._1차원배열;

import java.util.Scanner;

public class S2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 9;
        int[] arr = new int[N];

        int max = 0;
        int max_index = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                max_index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(max_index);
        sc.close();
    }
}

// 메모리: 17652KB, 시간: 184ms
