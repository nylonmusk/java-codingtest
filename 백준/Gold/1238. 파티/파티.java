import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Road implements Comparable<Road> {
    int end;
    int time;

    Road(int end, int time) {
        this.end = end;
        this.time = time;
    }

    @Override
    public int compareTo(Road o) {
        return this.time - o.time;
    }
}

class Main {
    static int N;
    static int M;
    static int X;
    static List<List<Road>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            graph.get(A).add(new Road(B, T));
        }

        int[] toX = dijkstra(X);
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            int[] fromI = dijkstra(i);
            answer = Math.max(answer, toX[i] + fromI[X]);
        }
        System.out.println(answer);
    }

    static int[] dijkstra(int start) {
        int[] distance = new int[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Road> pq = new PriorityQueue<>();
        pq.offer(new Road(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Road road = pq.poll();
            int now = road.end;
            int time = road.time;

            if (time > distance[now]) {
                continue;
            }

            for (Road nextRoad : graph.get(now)) {
                int next = nextRoad.end;
                int nextTime = time + nextRoad.time;

                if (nextTime < distance[next]) {
                    distance[next] = nextTime;
                    pq.offer(new Road(next, nextTime));
                }
            }
        }
        return distance;
    }
}
