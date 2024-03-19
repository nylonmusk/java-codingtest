import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Node {
    int end;
    int distance;

    Node(int end, int distance) {
        this.end = end;
        this.distance = distance;
    }
}

public class Main {
    private static List<List<Node>> graph;
    private static boolean[] isVisited;
    private static int V;
    private static int answer;
    private static int node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        V = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                int end = Integer.parseInt(st.nextToken());
                if (end == -1) break;
                int distance = Integer.parseInt(st.nextToken());
                graph.get(start).add(new Node(end, distance));
            }
        }

        // 어떤 정점에서 시작하던 가장 긴 두개의 정점중 하나로 간다
        isVisited = new boolean[V + 1];
        dfs(2, 0);
        isVisited = new boolean[V + 1];
        dfs(node, 0);
        System.out.println(answer);
    }

    private static void dfs(int now, int distance) {
        if (distance > answer) {
            answer = distance;
            node = now;
        }

        isVisited[now] = true;
        for (Node next : graph.get(now)) {
            if (!isVisited[next.end]) {
                dfs(next.end, distance + next.distance);
            }
        }
    }
}
