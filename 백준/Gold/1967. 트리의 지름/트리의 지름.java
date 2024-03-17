import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node {
    int child;
    int weight;

    Node(int child, int weight) {
        this.child = child;
        this.weight = weight;
    }
}

public class Main {
    private static int n;
    private static int answer;
    private static boolean visited[];
    private static List<List<Node>> nodes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            nodes.get(parent).add(new Node(child, weight));
            nodes.get(child).add(new Node(parent, weight));
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            visited[i] = true;
            dfs(i, 0);
        }
        System.out.println(answer);
    }

    private static void dfs(int i, int weight) {
        for (Node node : nodes.get(i)) {
            if (!visited[node.child]) {
                visited[node.child] = true;
                dfs(node.child, weight + node.weight);
            }
        }
        answer = Math.max(answer, weight);
    }
}
