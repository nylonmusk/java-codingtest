import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] iceberg;
    static boolean[][] isVisited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        iceberg = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                iceberg[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        while (true) {
            int pieces = countIcebergs();
            if (pieces == 0) {
                answer = 0;
                break;
            } else if (pieces >= 2) {
                break;
            }
            meltIcebergs();
            answer++;
        }

        System.out.println(answer);
    }

    private static int countIcebergs() {
        isVisited = new boolean[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!isVisited[i][j] && iceberg[i][j] != 0) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void meltIcebergs() {
        int[][] nextIceberg = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (iceberg[i][j] != 0) {
                    int seaNeighbors = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && ny >= 0 && nx < N && ny < M && iceberg[nx][ny] == 0) {
                            seaNeighbors++;
                        }
                    }
                    nextIceberg[i][j] = Math.max(iceberg[i][j] - seaNeighbors, 0);
                }
            }
        }
        iceberg = nextIceberg;
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !isVisited[nx][ny] && iceberg[nx][ny] != 0) {
                    queue.add(new int[]{nx, ny});
                    isVisited[nx][ny] = true;
                }
            }
        }
    }
}
