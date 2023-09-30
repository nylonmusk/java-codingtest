import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int answer = 0;
    static int N, M;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        buildWall(0);

        System.out.println(answer);
    }

    static void buildWall(int depth) {
        if (depth == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    buildWall(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        int[][] newMap = new int[N][M];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                newMap[i][j] = map[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (newMap[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            for (int index = 0; index < 4; index++) {
                int nx = x + dx[index];
                int ny = y + dy[index];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (newMap[nx][ny] == 0) {
                        newMap[nx][ny] = 2;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        countBlank(newMap);
    }

    public static void countBlank(int[][] newMap) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (newMap[i][j] == 0) {
                    count++;
                }
            }
        }
        answer = Math.max(answer, count);
    }
}
