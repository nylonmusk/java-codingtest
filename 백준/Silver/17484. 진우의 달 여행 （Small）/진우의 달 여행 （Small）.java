import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] matrix;
    private static int N;
    private static int M;
    private static int answer = Integer.MAX_VALUE;
    private static int[] dy = {-1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < M; i++) {
            getMinimumFuel(0, i, matrix[0][i], 9);
        }

        System.out.println(answer);
    }

    private static void getMinimumFuel(int depth, int y, int cost, int direction) {
        if (depth == N - 1) {
            answer = Math.min(answer, cost);
            return;
        }

        for (int i = 0; i < 3; i++) {
            int ny = y + dy[i];
            if (direction != i && ny >= 0 && ny < M) {
                getMinimumFuel(depth + 1, ny, cost + matrix[depth + 1][ny], i);
            }
        }
    }
}
