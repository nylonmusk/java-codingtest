import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

class Bus implements Comparable<Bus> {
    int end;
    int cost;

    Bus(int end, int cost) {
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Bus b) {
        return this.cost - b.cost;
    }
}

public class Main {
    static int n;
    static List<Bus>[] buses;
    static int[] dist;
    static int[] route;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        buses = new ArrayList[n + 1];

        dist = new int[n + 1];
        route = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            buses[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            buses[start].add(new Bus(end, cost));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        dijkstra(start);

        System.out.println(dist[end]);
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(end);
        while (route[end] != 0) {
            count++;
            stack.push(route[end]);
            end = route[end];
        }
        System.out.println(count);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static void dijkstra(int start) {
        PriorityQueue<Bus> pq = new PriorityQueue<>();
        pq.offer(new Bus(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Bus bus = pq.poll();
            if (dist[bus.end] < bus.cost) {
                continue;
            }
            for (Bus next : buses[bus.end]) {
                if (dist[next.end] > dist[bus.end] + next.cost) {
                    dist[next.end] = dist[bus.end] + next.cost;
                    route[next.end] = bus.end;
                    pq.offer(new Bus(next.end, dist[next.end]));
                }
            }
        }
    }
}
