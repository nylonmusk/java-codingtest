import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] box;
    static boolean[][][] visited;
    static int M, N, H;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        int days = bfs();

        if (checkAllRipe()) {
            System.out.println(days);
        } else {
            System.out.println(-1);
        }
    }

    public static int bfs() {
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 1) {
                        queue.offer(new Point(i, j, k));
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            days++;

            for (int i = 0; i < size; i++) {
                Point current = queue.poll();

                for (int j = 0; j < 6; j++) {
                    int nz = current.z + dz[j];
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];

                    if (nz >= 0 && nx >= 0 && ny >= 0 && nz < H && nx < N && ny < M) {
                        if (!visited[nz][nx][ny] && box[nz][nx][ny] == 0) {
                            queue.offer(new Point(nz, nx, ny));
                            visited[nz][nx][ny] = true;
                            box[nz][nx][ny] = 1;
                        }
                    }
                }
            }
        }

        return days;
    }

    public static boolean checkAllRipe() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static class Point {
        int z, x, y;

        public Point(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
}