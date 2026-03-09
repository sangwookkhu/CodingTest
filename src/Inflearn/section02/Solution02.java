package Inflearn.section02;

import java.util.Scanner;

public class Solution02 {
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution02 s = new Solution02();
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(s.solution(n, arr));
    }

}
