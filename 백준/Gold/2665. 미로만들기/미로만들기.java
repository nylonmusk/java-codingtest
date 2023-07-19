import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
    static int n;
    static int[][] distance;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] rooms;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        rooms = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                rooms[i][j] = str.charAt(j) - 48;
            }
        }
        distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        dijkstra();
        System.out.println(distance[n - 1][n - 1]);
    }

    static void dijkstra() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[]{0, 0, 0});
        distance[0][0] = 0;
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int x = now[0];
            int y = now[1];
            int count = now[2];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (distance[nx][ny] > distance[x][y] + rooms[nx][ny] && rooms[nx][ny] == 1) {
                        distance[nx][ny] = distance[x][y];
                        pq.offer(new int[]{nx, ny, distance[nx][ny]});
                    } else if(distance[nx][ny] > distance[x][y] + rooms[nx][ny] && rooms[nx][ny] == 0) {
                        distance[nx][ny] = distance[x][y] + 1;
                        pq.offer(new int[]{nx, ny, distance[nx][ny]});
                    }
                }
            }
        }

    }
}
