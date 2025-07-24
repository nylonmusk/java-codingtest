import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] indegree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        indegree = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int[] seq = new int[cnt];
            for (int j = 0; j < cnt; j++) {
                seq[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < cnt - 1; j++) {
                int from = seq[j];
                int to = seq[j + 1];
                graph.get(from).add(to);
                indegree[to]++;
            }
        }

        List<Integer> result = topologySort();

        if (result.size() == N) {
            for (int singer : result) {
                System.out.println(singer);
            }
        } else {
            System.out.println(0);
        }
    }

    private static List<Integer> topologySort() {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            order.add(now);

            for (int next : graph.get(now)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return order;
    }
}