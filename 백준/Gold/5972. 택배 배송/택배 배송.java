import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Cow implements Comparable<Cow> {
    int to;
    int food;

    Cow(int to, int food) {
        this.to = to;
        this.food = food;
    }

    @Override
    public int compareTo(Cow c) {
        return this.food - c.food;
    }
}

public class Main {
    static List<List<Cow>> roads = new ArrayList<>();
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 0; i <= N; i++) {
            roads.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            roads.get(A).add(new Cow(B, C));
            roads.get(B).add(new Cow(A, C));
        }

        dijkstra();

        System.out.println(dist[N]);
    }

    static void dijkstra() {
        PriorityQueue<Cow> pq = new PriorityQueue<>();
        pq.offer(new Cow(1, 0));
        dist[1] = 0;

        while (!pq.isEmpty()) {
            Cow now = pq.poll();
            if (dist[now.to] < now.food) {
                continue;
            }

            for (Cow next : roads.get(now.to)) {
                if (dist[now.to] + next.food < dist[next.to]) {
                    dist[next.to] = dist[now.to] + next.food;
                    pq.offer(new Cow(next.to, dist[next.to]));
                }
            }
        }
    }
}
