import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] bridge = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                bridge[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[N][M];

        for (int j = 0; j < M; j++) {
            if (bridge[0][j] == 1) {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (bridge[i][j] == 1) {
                    if (j > 0 && bridge[i - 1][j - 1] == 1) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                    }
                    if (bridge[i - 1][j] == 1) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                    }
                    if (j < M - 1 && bridge[i - 1][j + 1] == 1) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
                    }
                }
            }
        }

        int answer = 0;
        for (int j = 0; j < M; j++) {
            answer = (answer + dp[N - 1][j]) % MOD;
        }

        System.out.println(answer);
    }
}
