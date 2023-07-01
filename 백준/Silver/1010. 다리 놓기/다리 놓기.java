import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            long[][] dp = new long[M + 1][N + 1];

            for (int i = 1; i <= M; i++) {
                dp[i][1] = i;
            }

            for (int i = 2; i <= M; i++) {
                for (int j = 2; j <= N; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                }
            }
            answer.append(dp[M][N]).append("\n");
        }
        System.out.println(answer);
    }
}
