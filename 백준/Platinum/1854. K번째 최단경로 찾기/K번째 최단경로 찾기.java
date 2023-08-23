import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Walk implements Comparable<Walk> {
    int to;
    int time;

    Walk(int to, int time) {
        this.to = to;
        this.time = time;
    }

    @Override
    public int compareTo(Walk w) {
        return this.time - w.time;
    }
}

public class Main {
    static List<List<Walk>> roads = new ArrayList<>();
    static int n;
    static PriorityQueue<Integer>[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        distance = new PriorityQueue[n + 1];

        for (int i = 0; i <= n; i++) {
            roads.add(new ArrayList<>());
            distance[i] = new PriorityQueue<>(Collections.reverseOrder());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            roads.get(a).add(new Walk(b, c));
        }

        dijkstra(k);
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (distance[i].size() == k) {
                answer.append(distance[i].peek());
            } else {
                answer.append(-1);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }

    static void dijkstra(int k) {
        PriorityQueue<Walk> pq = new PriorityQueue();
        pq.offer(new Walk(1, 0));
        distance[1].add(0);

        while (!pq.isEmpty()) {
            Walk walk = pq.poll();
            if (distance[walk.to].size() > k) {
                continue;
            }

            for (Walk next : roads.get(walk.to)) {
                if (distance[next.to].size() < k) {
                    distance[next.to].offer(walk.time + next.time);
                    pq.offer(new Walk(next.to, walk.time + next.time));
                } else if (distance[next.to].peek() > walk.time + next.time) {
                    distance[next.to].poll();
                    distance[next.to].offer(walk.time + next.time);
                    pq.offer(new Walk(next.to, walk.time + next.time));
                }
            }
        }
    }
}
