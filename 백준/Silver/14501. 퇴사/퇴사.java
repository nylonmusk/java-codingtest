import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1]);

            int nextDay = i + T[i];
            if (nextDay <= N + 1) {
                dp[nextDay] = Math.max(dp[nextDay], dp[i] + P[i]);
            }
        }

        int maxProfit = 0;
        for (int i = 1; i <= N + 1; i++) {
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        System.out.println(maxProfit);
    }
}