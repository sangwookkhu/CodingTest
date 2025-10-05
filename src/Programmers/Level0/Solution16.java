package Programmers.Level0;

// n 번째 원소부터
// https://school.programmers.co.kr/learn/courses/30/lessons/181892

public class Solution16 {
    public int[] solution(int[] num_list, int n) {

        int[] arr1 = new int[n];
        int[] arr2 = new int[num_list.length - n];

        for(int i = 0; i < num_list.length; i++) {
            if (i < n) {
                arr1[i] = num_list[i];
            } else {
                arr2[i - n] = num_list[i];
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();

        System.out.println(s.solution(new int[]{2, 1, 6}, 3));
        System.out.println(s.solution(new int[]{5, 2, 1, 7, 5}, 2));
    }
}
