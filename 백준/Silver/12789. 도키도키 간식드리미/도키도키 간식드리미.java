import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int need = 1;

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());

            if (cur == need) {
                need++;
            } else {
                while (!stack.isEmpty() && stack.peek() == need) {
                    stack.pop();
                    need++;
                }
                stack.push(cur);
            }
        }

        while (!stack.isEmpty() && stack.peek() == need) {
            stack.pop();
            need++;
        }

        if (need == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}