import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] sequence = new int[N + 1];
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int i = 1, j = 0;
        while (!stack.isEmpty() || j < N || i < N + 1) {
            if (!stack.isEmpty() && stack.peek() == sequence[j]) {
                stack.pop();
                sb.append("-").append("\n");
                j++;
                continue;
            }
            if (!stack.isEmpty() && i >= N + 1) {
                break;
            }
            stack.push(i);
            sb.append("+").append("\n");
            i++;
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}