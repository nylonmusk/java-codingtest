import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static boolean[][] maze;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        maze = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == '1') {
                    maze[i][j] = true;
                }
            }
        }

        bfs(0, 0);
        System.out.println(min);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        int[] temp = {x, y, 1};
        q.add(temp);

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            x = poll[0];
            y = poll[1];
            int count = poll[2];

            if (x == N - 1 && y == M - 1) {
                min = Math.min(min, count);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && maze[nx][ny]) {
                    visited[nx][ny] = true;
                    int[] path = {nx, ny, count + 1};
                    q.add(path);
                }
            }
        }
    }
}
