import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] Ds = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                Ds[i] = Integer.parseInt(st.nextToken());
            }

            List<List<Integer>> constructionOrder = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                constructionOrder.add(new ArrayList<>());
            }

            int[] indegree = new int[N + 1];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int now = Integer.parseInt(st.nextToken());
                int next = Integer.parseInt(st.nextToken());
                constructionOrder.get(now).add(next);
                indegree[next]++;
            }

            int W = Integer.parseInt(br.readLine());

            int[] time = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                time[i] = Ds[i];
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) {
                    queue.add(i);
                }
            }

            while (!queue.isEmpty()) {
                int now = queue.poll();
                for (int next : constructionOrder.get(now)) {
                    indegree[next]--;
                    time[next] = Math.max(time[next], time[now] + Ds[next]);
                    if (indegree[next] == 0) {
                        queue.add(next);
                    }
                }
            }

            answer.append(time[W]).append('\n');
        }
        System.out.print(answer);
    }
}