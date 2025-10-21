import java.io.*;
import java.util.*;

public class Main {
    private static int N, M, K;
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int[] candy;
    private static ArrayList<int[]> groups = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        candy = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            candy[i] = Integer.parseInt(st.nextToken());
        }

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) groups.add(dfs(i));
        }

        int[] dp = new int[K];
        for (int[] g : groups) {
            int cnt = g[0], sum = g[1];
            for (int j = K - 1; j >= cnt; j--) {
                dp[j] = Math.max(dp[j], dp[j - cnt] + sum);
            }
        }
        int ans = 0;
        for (int i = 0; i < K; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }

    private static int[] dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        int cnt = 0, sum = 0;
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            cnt++;
            sum += candy[cur];
            for (int nxt : graph[cur]) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    stack.push(nxt);
                }
            }
        }
        return new int[]{cnt, sum};
    }
}


