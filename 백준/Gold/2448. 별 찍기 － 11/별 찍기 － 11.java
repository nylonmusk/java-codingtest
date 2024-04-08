import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] board = new boolean[N][N * 2];

        star(0, 0, N, board);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                answer.append(board[i][j] ? "*" : " ");
            }
            answer.append('\n');
        }

        System.out.print(answer);
    }

    private static void star(int i, int j, int size, boolean[][] board) {
        if (size == 3) {
            board[i][j + 2] = board[i + 1][j + 1] = board[i + 1][j + 3] = true;
            for (int k = 0; k < 5; k++) {
                board[i + 2][j + k] = true;
            }
            return;
        }

        int resize = size / 2;
        star(i, j + resize, resize, board);
        star(i + resize, j, resize, board);
        star(i + resize, j + size, resize, board);
    }
}

