import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class SuffixArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int N = S.length();

        String[] suffixes = new String[N];

        for (int i = 0; i < N; i++) {
            suffixes[i] = S.substring(i);
        }

        Arrays.sort(suffixes);

        for (String suffix : suffixes) {
            sb.append(suffix).append('\n');
        }

        System.out.print(sb);
    }
}