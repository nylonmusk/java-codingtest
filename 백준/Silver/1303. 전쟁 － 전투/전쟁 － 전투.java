import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static char[][] soldiers;
    static boolean[][] isVisited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N, M;
    static long W, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        soldiers = new char[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                soldiers[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!isVisited[i][j]) {
                    int soldier = dfs(i, j, soldiers[i][j], 1);
                    if (soldiers[i][j] == 'W') {
                        W += (long) Math.pow(soldier, 2);
                    } else {
                        B += (long) Math.pow(soldier, 2);

                    }
                }
            }
        }
        System.out.println(W + " " + B);
    }

    private static int dfs(int x, int y, char soldier, int sum) {
        isVisited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                continue;
            }

            if (soldiers[nx][ny] != soldier) {
                continue;
            }

            if (!isVisited[nx][ny]) {
                sum = dfs(nx, ny, soldier, sum + 1);
            }
        }
        return sum;
    }
}