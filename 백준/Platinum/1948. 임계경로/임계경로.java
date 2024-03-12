import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Road {
    int end;
    int time;

    Road(int end, int time) {
        this.end = end;
        this.time = time;
    }
}

public class Main {
    private static int n, m, start, destination;
    private static StringBuilder answer = new StringBuilder();
    private static int[] distance;
    private static final List<List<Road>> roads = new ArrayList<>();
    private static final List<List<Road>> reverseRoads = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        distance = new int[n + 1];
        StringTokenizer st;
        
        for (int i = 0; i <= n; i++) {
            roads.add(new ArrayList<>());
            reverseRoads.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            roads.get(start).add(new Road(end, time));
            reverseRoads.get(end).add(new Road(start, time));
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        destination = Integer.parseInt(st.nextToken());

        countUnstoppablePathQuantity();
        countPathQuantity();

        System.out.println(answer);
    }

    private static void countUnstoppablePathQuantity() {
        PriorityQueue<Road> pq = new PriorityQueue<>((a, b) -> b.time - a.time);

        pq.offer(new Road(start, 0));
        while (!pq.isEmpty()) {
            Road now = pq.poll();
            if (now.time < distance[now.end]) continue;

            for (Road next : roads.get(now.end)) {
                if (distance[next.end] < distance[now.end] + next.time) {
                    distance[next.end] = distance[now.end] + next.time;
                    pq.offer(new Road(next.end, distance[next.end]));
                }
            }
        }
        answer.append(distance[destination]).append("\n");
    }

    private static void countPathQuantity() {
        int count = 0;
        boolean[] isVisited = new boolean[n + 1];
        isVisited[destination] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(destination);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Road next : reverseRoads.get(now)) {
                if (distance[now] - next.time == distance[next.end]) {
                    count++;
                    if (!isVisited[next.end]) {
                        isVisited[next.end] = true;
                        queue.add(next.end);
                    }
                }
            }
        }
        answer.append(count);
    }
}

