import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Ball {
        int rx, ry, bx, by, count;

        public Ball(int rx, int ry, int bx, int by, int count) {
            this.rx = rx;
            this.ry = ry;
            this.bx = bx;
            this.by = by;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        int rx = 0, ry = 0, bx = 0, by = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                } else if (board[i][j] == 'B') {
                    bx = i;
                    by = j;
                }
            }
        }

        System.out.println(bfs(board, rx, ry, bx, by));
    }

    static int bfs(char[][] board, int rx, int ry, int bx, int by) {
        boolean[][][][] visited = new boolean[10][10][10][10];
        Queue<Ball> queue = new ArrayDeque<>();
        queue.offer(new Ball(rx, ry, bx, by, 0));
        visited[rx][ry][bx][by] = true;

        while (!queue.isEmpty()) {
            Ball current = queue.poll();
            int count = current.count;

            if (count >= 10) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nRx = current.rx;
                int nRy = current.ry;
                int nBx = current.bx;
                int nBy = current.by;

                boolean redInHole = false;
                boolean blueInHole = false;

                while (board[nRx + dx[i]][nRy + dy[i]] != '#' && board[nRx][nRy] != 'O') {
                    nRx += dx[i];
                    nRy += dy[i];
                    if (board[nRx][nRy] == 'O') {
                        redInHole = true;
                        break;
                    }
                }

                while (board[nBx + dx[i]][nBy + dy[i]] != '#' && board[nBx][nBy] != 'O') {
                    nBx += dx[i];
                    nBy += dy[i];
                    if (board[nBx][nBy] == 'O') {
                        blueInHole = true;
                        break;
                    }
                }

                if (blueInHole)
                    continue;

                if (redInHole)
                    return count + 1;

                if (nRx == nBx && nRy == nBy) {
                    int redDist = Math.abs(nRx - current.rx) + Math.abs(nRy - current.ry);
                    int blueDist = Math.abs(nBx - current.bx) + Math.abs(nBy - current.by);
                    if (redDist > blueDist) {
                        nRx -= dx[i];
                        nRy -= dy[i];
                    } else {
                        nBx -= dx[i];
                        nBy -= dy[i];
                    }
                }

                if (!visited[nRx][nRy][nBx][nBy]) {
                    visited[nRx][nRy][nBx][nBy] = true;
                    queue.offer(new Ball(nRx, nRy, nBx, nBy, count + 1));
                }
            }
        }

        return -1;
    }
}
