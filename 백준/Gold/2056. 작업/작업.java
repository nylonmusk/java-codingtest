import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> graph;
    static int[] time;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        time = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer st;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            time[i] = t;
            int m = Integer.parseInt(st.nextToken());
            for (int j = 0; j < m; j++) {
                int dependency = Integer.parseInt(st.nextToken());
                graph.get(i).add(dependency);
            }
        }

        int[] completionTime = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dfs(i, completionTime);
        }

        int maxTime = 0;
        for (int i = 1; i <= N; i++) {
            maxTime = Math.max(maxTime, completionTime[i] + time[i]);
        }

        System.out.println(maxTime);
    }

    private static void dfs(int node, int[] completionTime) {
        for (int next : graph.get(node)) {
            if (completionTime[next] == 0) {
                dfs(next, completionTime);
            }
            completionTime[node] = Math.max(completionTime[node], completionTime[next] + time[next]);
        }
    }
}
