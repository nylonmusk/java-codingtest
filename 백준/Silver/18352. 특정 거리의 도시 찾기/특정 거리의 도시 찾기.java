import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[] distance;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        distance = new int[N + 1];
        Arrays.fill(distance, -1);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
        }

        dijkstra(X);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == K) {
                answer.add(i);
            }
        }

        if (answer.size() != 0) {
            answer.sort((a, b) -> a - b);
            for (int i : answer) {
                System.out.println(i);
            }
        } else {
            System.out.println(-1);
        }
    }

    static void dijkstra(int start) {
        distance[start] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 0; i < graph.get(now).size(); i++) {
                int next = graph.get(now).get(i);
                if (distance[next] == -1) {
                    distance[next] = distance[now] + 1;
                    queue.offer(next);
                }
            }
        }
    }
}
