import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[][] a;
    private static boolean[][] visited;
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0;
        while (true) {
            visited = new boolean[N][M];
            markOutsideAir();

            List<int[]> melts = new ArrayList<>();
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (a[r][c] == 1) {
                        int cnt = 0;
                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];
                            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                                if (visited[nr][nc]) cnt++;
                            }
                        }
                        if (cnt >= 2) {
                            melts.add(new int[]{r, c});
                        }
                    }
                }
            }

            if (melts.isEmpty()) break;
            for (int[] p : melts) {
                a[p[0]][p[1]] = 0;
            }

            time++;
        }

        System.out.println(time);
    }

    private static void markOutsideAir() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (visited[nr][nc]) continue;
                if (a[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
}