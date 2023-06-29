import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int b;
    int c;

    Node(int b, int c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.c, o.c);
    }
}

public class Main {
    static int N;
    static int v1;
    static int v2;
    static List<List<Node>> graph = new ArrayList<>();
    static int[] distance;
    static final int INF = 200000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());

        distance = new int[N + 1];

        int result1 = dijkstra(1, v1) + dijkstra(v1, v2) + dijkstra(v2, N);
        int result2 = dijkstra(1, v2) + dijkstra(v2, v1) + dijkstra(v1, N);
        if (INF <= result1 && INF <= result2) {
            System.out.println("-1");
        } else {
            System.out.println(Math.min(result1, result2));
        }
    }

    private static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        Arrays.fill(distance, INF);
        distance[start] = 0;
        boolean[] visited = new boolean[N + 1];

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (visited[current.b]) {
                continue;
            }
            visited[current.b] = true;
            for (Node node : graph.get(current.b)) {
                if (distance[node.b] > node.c + distance[current.b]) {
                    distance[node.b] = node.c + distance[current.b];
                    pq.offer(new Node(node.b, distance[node.b]));
                }
            }
        }
        return distance[end];
    }
}
