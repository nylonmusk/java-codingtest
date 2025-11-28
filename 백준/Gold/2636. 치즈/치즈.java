import java.util.*;
import java.io.*;

public class Main {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0;
        int lastCheese = 0;

        while (true) {
            int cheeseCount = countCheese();
            if (cheeseCount == 0) {
                System.out.println(time);
                System.out.println(lastCheese);
                return;
            }
            lastCheese = cheeseCount;
            melt();
            time++;
        }
    }

    private static int countCheese() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) cnt++;
            }
        }
        return cnt;
    }

    private static void melt() {
        visited = new boolean[N][M];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny]) continue;

                if (map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                } else {
                    q.add(new int[]{nx, ny});
                }
                visited[nx][ny] = true;
            }
        }
    }
}