import java.io.*;
import java.util.*;

public class Main {
    static final int LIMIT = 1000000000;
    static long[][] dp = new long[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        for (int i = 0; i <= 100; i++) {
            dp[i][0] = dp[0][i] = 1;
        }
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                dp[i][j] = Math.min((long)LIMIT + 1, dp[i-1][j] + dp[i][j-1]);
            }
        }

        if (dp[N][M] < K) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (N > 0 && M > 0) {
            long countAFirst = dp[N-1][M];
            if (K <= countAFirst) {
                sb.append('a');
                N--;
            } else {
                sb.append('z');
                K -= countAFirst;
                M--;
            }
        }

        while (N-- > 0) sb.append('a');
        while (M-- > 0) sb.append('z');

        System.out.println(sb);
    }
}