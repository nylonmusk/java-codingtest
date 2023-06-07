import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, board[i][j]);
                max = Math.max(max, board[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        for (int i = min; i <= max; i++) {
            int blocks = b;
            int time = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (board[j][k] > i) {
                        time += (board[j][k] - i) * 2;
                        blocks += (board[j][k] - i);
                    } else if (board[j][k] < i) {
                        time += (i - board[j][k]);
                        blocks -= (i - board[j][k]);
                    }
                }
            }

            if (blocks >= 0 && minTime >= time) {
                minTime = time;
                height = i;
            }
        }
        System.out.println(minTime + " " + height);
    }
}