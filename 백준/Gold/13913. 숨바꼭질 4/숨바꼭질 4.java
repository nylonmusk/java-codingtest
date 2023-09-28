import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] parent = new int[100001];
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bfs();
        Stack<Integer> stack = new Stack<>();
        stack.push(K);
        int index = K;
        while (index != N) {
            stack.push((parent[index]));
            index = parent[index];
        }
        StringBuilder answer = new StringBuilder();

        answer.append(time[K] - 1).append("\n");
        while (!stack.isEmpty()) {
            answer.append(stack.pop()).append(" ");
        }

        System.out.println(answer);
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        time[N] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == K) return;

            checkAndAdd(q, now, now + 1);
            checkAndAdd(q, now, now - 1);
            checkAndAdd(q, now, now * 2);
        }
    }

    static void checkAndAdd(Queue<Integer> q, int now, int next) {
        if (next < 0 || next > 100000) return;

        if (time[next] == 0) {
            q.add(next);
            time[next] = time[now] + 1;
            parent[next] = now;
        }
    }
}