import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int answer = 0;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        StringTokenizer st = new StringTokenizer(br.readLine());

        int root = 0;
        for (int i = 0; i < N; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent != -1) graph.get(parent).add(i);
            else root = i;
        }

        K = Integer.parseInt(br.readLine());
        if (K != root) dfs(root);

        System.out.println(answer);
    }

    static void dfs(int start) {
        boolean isLeaf = true;

        for (int next : graph.get(start)) {
            if (next == K) continue;
            dfs(next);
            isLeaf = false;
        }

        if (isLeaf) answer++;
    }
}