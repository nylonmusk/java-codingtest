import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int v;
    int w;

    Node(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.w, o.w);
    }
}

public class Main {
    static int V;
    static List<Node>[] graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        graph = new List[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }

        distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        dijkstra(K);

        for (int i = 1; i <= V; i++) {
            if (K == i) {
                answer.append(0);
            } else {
                answer.append(distance[i] == Integer.MAX_VALUE ? "INF" : distance[i]);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }

    private static void dijkstra(int K) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));
        distance[K] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (current.w > distance[current.v]) {
                continue;
            }

            for (Node node : graph[current.v]) {
                if (distance[node.v] > current.w + node.w) {
                    distance[node.v] = current.w + node.w;
                    pq.offer(new Node(node.v, distance[node.v]));
                }
            }
        }
    }
}
