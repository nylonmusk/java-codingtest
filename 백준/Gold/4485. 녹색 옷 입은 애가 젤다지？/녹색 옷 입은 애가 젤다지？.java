import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] caves;
    static int[][] distance;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int idx = 1;
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            caves = new int[N][N];
            distance = new int[N][N];
            for (int i = 0; i < distance.length; i++) {
                for (int j = 0; j < distance.length; j++) {
                    distance[i][j] = Integer.MAX_VALUE;
                }
            }
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    caves[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dijkstra();
            answer.append("Problem ").append(idx).append(": ").append(distance[N - 1][N - 1]).append("\n");
            idx++;
        }
        System.out.println(answer);
    }

    static void dijkstra() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{0, 0, caves[0][0]});
        distance[0][0] = 0;
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];
            int money = current[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (distance[nx][ny] > money + caves[nx][ny]) {
                        distance[nx][ny] = money + caves[nx][ny];
                        pq.offer(new int[]{nx, ny, distance[nx][ny]});
                    }
                }
            }
        }
    }
}
