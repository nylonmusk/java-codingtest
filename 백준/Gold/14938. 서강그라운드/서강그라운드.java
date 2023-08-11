import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Road implements Comparable<Road> {
    int num;
    int length;

    Road(int num, int length) {
        this.num = num;
        this.length = length;
    }

    @Override
    public int compareTo(Road r) {
        return this.length - r.length;
    }
}

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static int n, m;
    static List<List<Road>> road = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] items = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= n; i++) {
            road.add(new ArrayList<>());
        }

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            road.get(a).add(new Road(b, l));
            road.get(b).add(new Road(a, l));
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int[] temp = dijkstra(i);
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                if (temp[j] != INF) {
                    sum += items[j];
                }
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }

    static int[] dijkstra(int start) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        PriorityQueue<Road> pq = new PriorityQueue<>();
        pq.offer(new Road(start, 0));
        while (!pq.isEmpty()) {
            Road now = pq.poll();
            if (now.length > dist[now.num]) {
                continue;
            }

            for (Road next : road.get(now.num)) {
                if (next.length + dist[now.num] <= m && dist[next.num] >= next.length + now.length) {
                    dist[next.num] = next.length + now.length;
                    pq.offer(new Road(next.num, next.length + now.length));
                }
            }
        }
        return dist;
    }
}

