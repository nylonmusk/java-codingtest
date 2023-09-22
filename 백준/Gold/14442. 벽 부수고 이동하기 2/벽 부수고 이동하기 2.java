import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    int x, y, k, count;

    public Point(int x, int y, int k, int count) {
        this.x = x;
        this.y = y;
        this.k = k;
        this.count = count;
    }
    @Override
    public int compareTo(Point o) {
        return this.count - o.count;
    }
}

public class Main {
    static int N, M, K;
    static int[][] board;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M][K + 1];
        for (int i = 0; i < N; i++) {
            int j = 0;
            for (String s : br.readLine().split("")) {
                board[i][j] = Integer.parseInt(s);
                j++;
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 0, 1));
        while (!queue.isEmpty()) {
            Point now = queue.poll();
            if (now.x == N - 1 && now.y == M - 1) {
                return now.count;
            }
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (board[nx][ny] == 0 && !visited[nx][ny][now.k]) {
                        visited[nx][ny][now.k] = true;
                        queue.offer(new Point(nx, ny, now.k, now.count + 1));
                    } else if (now.k < K && !visited[nx][ny][now.k + 1]) {
                        visited[nx][ny][now.k + 1] = true;
                        queue.offer(new Point(nx, ny, now.k + 1, now.count + 1));
                    }
                }
            }
        }
        return -1;
    }
}