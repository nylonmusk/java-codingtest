import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int count = 0;
    static boolean[] visited;
    static boolean[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        graph = new boolean[N + 1][N + 1];
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = true;
        }
        dfs(1);
        if (count != 0) {
            System.out.println(count - 1);
        } else {
            System.out.println(0);
        }
    }

    public static void dfs(int V) {
        visited[V] = true;
        count++;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[V][i]) {
                dfs(i);
            }
        }
    }
}