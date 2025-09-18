import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int to, dist;
        Edge(int to, int dist) {
            this.to = to;
            this.dist = dist;
        }
    }

    static List<Edge>[] graph;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, d));
            graph[b].add(new Edge(a, d));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(bfs(start, end)).append("\n");
        }

        System.out.print(sb);
    }

    static int bfs(int start, int target) {
        boolean[] visited = new boolean[N + 1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, 0});
        visited[start] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0];
            int dist = cur[1];

            if (node == target) return dist;

            for (Edge e : graph[node]) {
                if (!visited[e.to]) {
                    visited[e.to] = true;
                    q.add(new int[]{e.to, dist + e.dist});
                }
            }
        }
        return -1;
    }
}