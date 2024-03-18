import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final long MOD = 1000000007;
    private static long[][] origin = {{1, 1}, {1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long[][] A = {{1, 1}, {1, 0}};

        System.out.println(pow(A, n - 1)[0][0]);
    }

    private static long[][] pow(long[][] A, long exp) {
        if (exp == 1 || exp == 0) {
            return A;
        }
        long[][] result = pow(A, exp / 2);

        result = multiply(result, result);

        if (exp % 2 != 0) {
            result = multiply(result, origin);
        }
        return result;
    }

    public static long[][] multiply(long[][] o1, long[][] o2) {
        long[][] result = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += o1[i][k] * o2[k][j];
                    result[i][j] %= MOD;
                }
            }
        }
        return result;
    }
}
