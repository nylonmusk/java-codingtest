import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<List<Integer>> graph;
    private static boolean[] visited;
    private static int[] nodeType;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (K-- > 0) {
            graph = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            visited = new boolean[V + 1];
            nodeType = new int[V + 1];

            for (int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            boolean isValid = true;
            for (int i = 1; i <= V; i++) {
                if (isValid) {
                    isValid = dfs(i);
                } else {
                    break;
                }
            }

            answer.append(isValid ? "YES" : "NO").append("\n");
        }

        System.out.println(answer);
    }

    private static boolean dfs(int node) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                nodeType[neighbor] = (nodeType[node] + 1) % 2;
                dfs(neighbor);
            } else if (nodeType[node] == nodeType[neighbor]) {
                return false;
            }
        }

        return true;
    }
}
