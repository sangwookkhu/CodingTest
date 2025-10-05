import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StackImplementation {
    private static int[] stack = new int[10001];
    private static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    push(X);
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }

    private static void push(int X) {
        stack[++top] = X;
    }

    private static int pop() {
        if (empty() == 1) {
            return -1;
        } else {
            return stack[top--];
        }
    }

    private static int size() {
        return top + 1;
    }

    private static int empty() {
        if (top == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int top() {
        if (empty() == 1) {
            return -1;
        } else {
            return stack[top];
        }
    }
}