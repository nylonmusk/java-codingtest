import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        final int MOD = 1000000000;
        int[][] dp = new int[K + 1][N + 1];
        for (int j = 0; j <= N; j++) dp[1][j] = 1;
        for (int i = 2; i <= K; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                if (dp[i][j] >= MOD) dp[i][j] -= MOD;
            }
        }
        System.out.println(dp[K][N]);
    }
}