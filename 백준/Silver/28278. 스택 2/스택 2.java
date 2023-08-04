import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (command == 2) {
                if (!stack.isEmpty()) {
                    answer.append(stack.pop());
                } else {
                    answer.append(-1);
                }
                answer.append("\n");
            } else if (command == 3) {
                answer.append(stack.size());
                answer.append("\n");
            } else if (command == 4) {
                if (!stack.isEmpty()) {
                    answer.append(0);
                } else {
                    answer.append(1);
                }
                answer.append("\n");
            } else if (command == 5) {
                if (!stack.isEmpty()) {
                    answer.append(stack.peek());
                } else {
                    answer.append(-1);
                }
                answer.append("\n");
            }

        }
        System.out.println(answer);
    }
}

