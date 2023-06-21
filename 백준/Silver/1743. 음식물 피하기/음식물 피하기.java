import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int M;
    static int[][] hole;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        hole = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        while (K-- > 0) {
            st = new StringTokenizer(br.readLine());
            hole[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (!visited[i][j] && hole[i][j] == 1) {
                    max = Math.max(max, bfs(i, j));
                }
            }
        }
        System.out.println(max);
    }

    private static int bfs(int x, int y) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int[] temp = queue.poll();
            int xx = temp[0];
            int yy = temp[1];
            for (int i = 0; i < 4; i++) {
                int nx = xx + dx[i];
                int ny = yy + dy[i];
                if (nx > 0 && ny > 0 && nx <= N && ny <= M && !visited[nx][ny] && hole[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        return count;
    }
}
