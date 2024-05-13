import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());

            if (c == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (c == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (c == 3) {
                if (!deque.isEmpty()) {
                    answer.append(deque.pollFirst()).append("\n");
                } else {
                    answer.append(-1).append("\n");
                }
            } else if (c == 4) {
                if (!deque.isEmpty()) {
                    answer.append(deque.pollLast()).append("\n");
                } else {
                    answer.append(-1).append("\n");
                }
            } else if (c == 5) {
                answer.append(deque.size()).append("\n");
            } else if (c == 6) {
                if (deque.isEmpty()) {
                    answer.append(1);
                } else {
                    answer.append(0);
                }
                answer.append("\n");
            } else if (c == 7) {
                if (!deque.isEmpty()) {
                    answer.append(deque.peekFirst()).append("\n");
                } else {
                    answer.append(-1).append("\n");
                }

            } else if (c == 8) {
                if (!deque.isEmpty()) {
                    answer.append(deque.peekLast()).append("\n");
                } else {
                    answer.append(-1).append("\n");
                }
            }
        }
        System.out.println(answer);
    }
}
