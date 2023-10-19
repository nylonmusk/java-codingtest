import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int K, W, H;
    static int[][] board;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[] horseDx = {1, 1, -1, -1, 2, 2, -2, -2};
    static int[] horseDy = {2, -2, 2, -2, 1, -1, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        board = new int[W][H];

        for (int i = 0; i < W; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < H; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = bfs();
        System.out.println(answer);
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, K, 0});
        boolean[][][] visited = new boolean[W][H][K + 1];
        visited[0][0][K] = true;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int remainedMove = now[2];
            int count = now[3];

            if (x == W - 1 && y == H - 1) {
                return count;
            }

            if (remainedMove > 0) {
                for (int i = 0; i < 8; i++) {
                    int nx = x + horseDx[i];
                    int ny = y + horseDy[i];

                    if (nx >= 0 && ny >= 0 && nx < W && ny < H) {
                        if (board[nx][ny] != 1 && !visited[nx][ny][remainedMove - 1]) {
                            visited[nx][ny][remainedMove - 1] = true;
                            q.offer(new int[]{nx, ny, remainedMove - 1, count + 1});
                        }
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < W && ny < H) {
                    if (board[nx][ny] != 1 && !visited[nx][ny][remainedMove]) {
                        visited[nx][ny][remainedMove] = true;
                        q.offer(new int[]{nx, ny, remainedMove, count + 1});
                    }
                }
            }
        }
        return -1;
    }
}
