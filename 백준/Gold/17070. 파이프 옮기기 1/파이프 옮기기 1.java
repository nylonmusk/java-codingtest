import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] board;
    private static int answer, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        answer = 0;
        dfs(0, 1, 0);

        System.out.println(answer);
    }

    public static void dfs(int x, int y, int direction) {
        if (x == N - 1 && y == N - 1) {
            answer++;
            return;
        }

        if (direction == 0) {
            if (y + 1 < N && board[x][y + 1] == 0) {
                dfs(x, y + 1, 0);
            }
        } else if (direction == 1) {
            if (x + 1 < N && board[x + 1][y] == 0) {
                dfs(x + 1, y, 1);
            }
        } else if (direction == 2) {
            if (y + 1 < N && board[x][y + 1] == 0) {
                dfs(x, y + 1, 0);
            }
            if (x + 1 < N && board[x + 1][y] == 0) {
                dfs(x + 1, y, 1);
            }
        }

        if (y + 1 < N && x + 1 < N && board[x][y + 1] == 0 && board[x + 1][y] == 0 && board[x + 1][y + 1] == 0) {
            dfs(x + 1, y + 1, 2);
        }
    }
}