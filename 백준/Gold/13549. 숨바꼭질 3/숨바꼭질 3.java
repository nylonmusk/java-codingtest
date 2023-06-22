import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int K;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        System.out.println(bfs());
    }

    private static int bfs() {
        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        visited[N] = true;
        queue.offer(new int[]{N, 0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int now = temp[0];
            int time = temp[1];
            visited[now] = true;
            if (now == K) {
                return time;
            }
            if (now + 1 <= 100000 && !visited[now + 1]) {
                queue.offer(new int[]{now + 1, time + 1});
            }

            if (now - 1 >= 0 && !visited[now - 1]) {
                queue.offer(new int[]{now - 1, time + 1});
            }

            if (now * 2 <= 100000 && !visited[now * 2]) {
                visited[now * 2] = true;
                queue.offer(new int[]{now * 2, time});
            }
        }
        return 18;
    }
}
