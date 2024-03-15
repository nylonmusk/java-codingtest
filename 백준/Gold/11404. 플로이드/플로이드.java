import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class City {
    int b;
    long c;

    City(int b, long c) {
        this.b = b;
        this.c = c;
    }
}

public class Main {
    private static int n;
    private static final long INF = Long.MAX_VALUE;
    private static List<List<City>> cities = new ArrayList<>();
    private static long[][] costs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i <= n; i++) {
            cities.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            cities.get(a).add(new City(b, c));
        }

        costs = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dijkstra(i);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                answer.append(costs[i][j] == INF ? 0 : costs[i][j]).append(" ");
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }

    private static void dijkstra(int start) {
        PriorityQueue<City> pq = new PriorityQueue<>((a, b) -> Math.toIntExact(a.c - b.c));
        boolean[] visited = new boolean[costs.length];
        Arrays.fill(costs[start], Long.MAX_VALUE);
        for (int i = 0; i <= n; i++) {
            costs[i][i] = 0;
        }
        pq.add(new City(start, 0));

        while (!pq.isEmpty()) {
            City now = pq.poll();
            int curCity = now.b;
            if (visited[curCity]) continue;
            visited[curCity] = true;

            for (City next : cities.get(curCity)) {
                int nextCity = next.b;
                long cost = next.c;
                if (costs[start][nextCity] > costs[start][curCity] + cost) {
                    costs[start][nextCity] = costs[start][curCity] + cost;
                    pq.offer(new City(nextCity, costs[start][nextCity]));
                }
            }
        }
    }
}
