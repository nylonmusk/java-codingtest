import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    private static int M;
    private static int N;
    private static boolean[][] visited;
    private static int[][] banner;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[M][N];
        banner = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                banner[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && banner[i][j] == 1) {
                    answer += bfs(i, j);
                }
            }
        }
        System.out.println(answer);
    }

    private static int bfs(int i, int j) {
        visited[i][j] = true;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        Queue<Banner> queue = new LinkedList<>();
        queue.offer(new Banner(i, j));

        while (!queue.isEmpty()) {
            Banner b = queue.poll();
            int x = b.x;
            int y = b.y;

            for (int k = 0; k < 8; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N && !visited[nx][ny] && banner[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new Banner(nx, ny));
                }
            }
        }
        return 1;
    }
}

class Banner {
    int x;
    int y;

    Banner(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
