import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];

        int x = N / 2;
        int y = N / 2;
        map[x][y] = 1;

        int num = 2;
        int step = 1;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (num <= N * N) {
            for (int d = 0; d < 4; d++) {
                int move = (d < 2) ? step : step + 1;
                for (int i = 0; i < move; i++) {
                    if (num > N * N) break;
                    x += dx[d];
                    y += dy[d];
                    map[x][y] = num++;
                }
            }
            step += 2;
        }

        int ansX = 0, ansY = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j]).append(" ");
                if (map[i][j] == target) {
                    ansX = i + 1;
                    ansY = j + 1;
                }
            }
            sb.append("\n");
        }
        sb.append(ansX).append(" ").append(ansY);
        System.out.println(sb);
    }
}