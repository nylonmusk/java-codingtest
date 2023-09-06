import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        StringBuilder answer = new StringBuilder();
        while (!q.isEmpty()) {
            answer.append(q.poll()).append(" ");
            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }
        System.out.println(answer);
    }
}