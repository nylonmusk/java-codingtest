import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        List<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        int[] parent = new int[N + 1];
        int[] size = new int[N + 1];
        int[] order = new int[N];
        int idx = 0;

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(R);
        parent[R] = -1;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            order[idx++] = node;
            for (int next : adj[node]) {
                if (next == parent[node]) continue;
                parent[next] = node;
                stack.push(next);
            }
        }

        for (int i = 1; i <= N; i++) {
            size[i] = 1;
        }

        for (int i = idx - 1; i >= 0; i--) {
            int node = order[i];
            int p = parent[node];
            if (p != -1) size[p] += size[node];
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int u = Integer.parseInt(br.readLine().trim());
            answer.append(size[u]).append('\n');
        }
        System.out.print(answer);
    }
}