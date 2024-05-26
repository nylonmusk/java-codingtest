import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            inDegree[y]++;
        }

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                pq.add(i);
            }
        }

        StringBuilder answer = new StringBuilder();
        while (!pq.isEmpty()) {
            int now = pq.poll();
            answer.append(now).append(" ");
            for (int next : graph.get(now)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    pq.add(next);
                }
            }
        }

        System.out.println(answer.toString().trim());
    }
}
