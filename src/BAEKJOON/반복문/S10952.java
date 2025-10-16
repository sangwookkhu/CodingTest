package BAEKJOON.반복문;

// A + B - 5
// https://www.acmicpc.net/problem/10952

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) break;

            st = new StringTokenizer(line);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            sb.append(A + B).append('\n');
        }

        System.out.print(sb.toString());

        br.close();
    }
}

// 메모리: 14184KB, 시간: 100ms