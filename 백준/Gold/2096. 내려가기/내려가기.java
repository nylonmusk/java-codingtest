import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N + 1][3];
        int[][] dpMax = new int[N + 1][3];
        int[][] dpMin = new int[N + 1][3];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < 3; j++) {
            dpMax[1][j] = dpMin[1][j] = board[1][j];
        }

        for (int i = 2; i <= N; i++) {
            dpMax[i][0] = Math.max(dpMax[i - 1][0], dpMax[i - 1][1]) + board[i][0];
            dpMax[i][1] = Math.max(Math.max(dpMax[i - 1][0], dpMax[i - 1][1]), dpMax[i - 1][2]) + board[i][1];
            dpMax[i][2] = Math.max(dpMax[i - 1][1], dpMax[i - 1][2]) + board[i][2];

            dpMin[i][0] = Math.min(dpMin[i - 1][0], dpMin[i - 1][1]) + board[i][0];
            dpMin[i][1] = Math.min(Math.min(dpMin[i - 1][0], dpMin[i - 1][1]), dpMin[i - 1][2]) + board[i][1];
            dpMin[i][2] = Math.min(dpMin[i - 1][1], dpMin[i - 1][2]) + board[i][2];
        }

        answer.append(Math.max(Math.max(dpMax[N][0], dpMax[N][1]), dpMax[N][2]));
        answer.append(" ");
        answer.append(Math.min(Math.min(dpMin[N][0], dpMin[N][1]), dpMin[N][2]));
        System.out.println(answer);
    }
}
