import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Bus implements Comparable<Bus> {
    int end;
    int cost;

    public Bus(int end, int cost) {
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Bus bus) {
        return Integer.compare(this.cost, bus.cost);
    }
}

class Main {
    static int N;
    static List<Bus>[] buses;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        buses = new ArrayList[N + 1];
        dist = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            buses[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            buses[start].add(new Bus(end, cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        dijkstra(start);
        System.out.println(dist[end]);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Bus> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Bus(start, 0));
        dist[start] = 0;

        while (!priorityQueue.isEmpty()) {
            Bus bus = priorityQueue.poll();
            int now = bus.end;
            int cost = bus.cost;

            if (cost > dist[now]) {
                continue;
            }

            for (Bus next : buses[now]) {
                int newCost = cost + next.cost;
                if (newCost < dist[next.end]) {
                    dist[next.end] = newCost;
                    priorityQueue.offer(new Bus(next.end, newCost));
                }
            }
        }
    }
}
