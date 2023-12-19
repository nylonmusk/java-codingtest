import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<List<Integer>> relation;
    private static boolean[] visited;
    private static boolean isExist = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        relation = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            relation.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relation.get(a).add(b);
            relation.get(b).add(a);
        }

        for (int i = 0; i < N; i++) {
            visited = new boolean[N];
            dfs(i, 0);
            if (isExist) break;
        }

        System.out.println(isExist ? 1 : 0);
    }

    private static void dfs(int node, int depth) {
        if (depth == 4) {
            isExist = true;
            return;
        }

        visited[node] = true;
        for (int r : relation.get(node)) {
            if (!visited[r]) {
                dfs(r, depth + 1);
            }
            if (isExist) return;
        }
        visited[node] = false;
    }
}