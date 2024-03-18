import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[][] procession;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        procession = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                procession[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }

        int[][] result = pow(procession, B);

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer.append(result[i][j]).append(' ');
            }
            answer.append('\n');
        }
        System.out.println(answer);
    }


    public static int[][] pow(int[][] A, long exp) {
        if (exp == 1L) {
            return A;
        }

        int[][] newProcession = pow(A, exp / 2);

        newProcession = multiply(newProcession, newProcession);

        if (exp % 2 != 0) {
            newProcession = multiply(newProcession, procession);
        }

        return newProcession;
    }

    public static int[][] multiply(int[][] o1, int[][] o2) {

        int[][] newProcession = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    newProcession[i][j] += o1[i][k] * o2[k][j];
                    newProcession[i][j] %= 1000;
                }
            }
        }
        return newProcession;
    }
}
