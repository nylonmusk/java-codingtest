import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[][] a;
    private static boolean[][] visited;
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int peaks = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    if (isPeakComponent(i, j)) peaks++;
                }
            }
        }
        System.out.println(peaks);
    }

    static boolean isPeakComponent(int sx, int sy) {
        int h = a[sx][sy];
        Queue<int[]> q = new ArrayDeque<>();
        visited[sx][sy] = true;
        q.add(new int[]{sx, sy});
        boolean isPeak = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 8; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (a[nx][ny] > h) {
                    isPeak = false;
                } else if (!visited[nx][ny] && a[nx][ny] == h) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return isPeak;
    }
}