import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Computer implements Comparable<Computer> {
    int to;
    int time;

    Computer(int to, int time) {
        this.to = to;
        this.time = time;
    }

    @Override
    public int compareTo(Computer c) {
        return this.time - c.time;
    }
}

public class Main {
    static int n, d, c;
    static List<List<Computer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                graph.get(b).add(new Computer(a, s));
            }

            dijkstra();
        }
    }

    static void dijkstra() {
        final int INF = Integer.MAX_VALUE;
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[c] = 0;

        PriorityQueue<Computer> pq = new PriorityQueue<>();
        pq.offer(new Computer(c, 0));

        while (!pq.isEmpty()) {
            Computer computer = pq.poll();
            int now = computer.to;
            int time = computer.time;

            if (dist[now] < time) continue;

            for (Computer next : graph.get(now)) {
                if (dist[next.to] > time + next.time ) {
                    dist[next.to] = time + next.time;
                    pq.offer(new Computer(next.to, time + next.time));
                }
            }
        }

        int count = 0;
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] != INF) {
                count++;
                maxTime = Math.max(maxTime, dist[i]);
            }
        }

        System.out.println(count + " " + maxTime);
    }
}
