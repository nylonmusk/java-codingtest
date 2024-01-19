import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int R;
    private static int min;
    private static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        min = Math.min(N, M) / 2;

        A = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < R; i++) {
            rotate();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate() {
        for (int j = 0; j < min; j++) {
            int rotatedA = A[j][j];

            for (int k = j + 1; k < M - j; k++)
                A[j][k - 1] = A[j][k];

            for (int k = j + 1; k < N - j; k++)
                A[k - 1][M - 1 - j] = A[k][M - 1 - j];

            for (int k = M - 2 - j; k >= j; k--)
                A[N - 1 - j][k + 1] = A[N - 1 - j][k];

            for (int k = N - 2 - j; k >= j; k--)
                A[k + 1][j] = A[k][j];

            A[j + 1][j] = rotatedA;
        }
    }
}