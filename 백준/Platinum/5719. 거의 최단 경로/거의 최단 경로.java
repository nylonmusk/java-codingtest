import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Gps implements Comparable<Gps> {
    int V;
    int P;

    Gps(int V, int P) {
        this.V = V;
        this.P = P;
    }

    @Override
    public int compareTo(Gps g) {
        return this.P - g.P;
    }
}

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static int N;
    static List<List<Gps>> roads;
    static int[] distance;
    static boolean[][] isVisited;
    static List<Integer>[] route;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;
            roads = new ArrayList<>();
            route = new ArrayList[N];
            distance = new int[N];
            isVisited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                roads.add(new ArrayList<>());
                route[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int U = Integer.parseInt(st.nextToken());
                int V = Integer.parseInt(st.nextToken());
                int P = Integer.parseInt(st.nextToken());
                roads.get(U).add(new Gps(V, P));
            }

            dijkstra(S);
            backTracking(S, D);
            dijkstra(S);

            if (distance[D] == INF) {
                answer.append(-1);
            } else {
                answer.append(distance[D]);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }

    static void dijkstra(int S) {
        Arrays.fill(distance, INF);
        PriorityQueue<Gps> pq = new PriorityQueue<>();
        pq.offer(new Gps(S, 0));
        distance[S] = 0;
        while (!pq.isEmpty()) {
            Gps gps = pq.poll();
            int now = gps.V;
            int dist = gps.P;
            if (distance[now] < dist) {
                continue;
            }

            for (Gps next : roads.get(now)) {

                if (!isVisited[now][next.V]) {
                    if (distance[next.V] == distance[now] + next.P) {
                        route[next.V].add(now);
                    } else if (distance[next.V] > distance[now] + next.P) {
                        distance[next.V] = distance[now] + next.P;
                        route[next.V].clear();
                        route[next.V].add(now);
                        pq.offer(new Gps(next.V, distance[next.V]));
                    }
                }
            }
        }
    }

    static void backTracking(int S, int D) {
        if (S == D) return;

        for (int n : route[D]) {
            if (!isVisited[n][D]) {
                isVisited[n][D] = true;
                backTracking(S, n);
            }
        }
    }
}
