import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N][N];
        int islandId = 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    markIsland(i, j, islandId++);
                }
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int id = 2; id < islandId; id++) {
            answer = Math.min(answer, bfs(id));
        }

        System.out.println(answer);
    }

    private static void markIsland(int x, int y, int id) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        map[x][y] = id;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    map[nx][ny] = id;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    private static int bfs(int id) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dist = new int[N][N];
        for (int[] d : dist) Arrays.fill(d, -1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == id) {
                    q.add(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (map[nx][ny] > 0 && map[nx][ny] != id) return dist[cur[0]][cur[1]];
                if (map[nx][ny] == 0 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}