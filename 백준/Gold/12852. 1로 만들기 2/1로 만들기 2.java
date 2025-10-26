import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] dp = new int[N + 1];
        int[] prev = new int[N + 1];
        dp[1] = 0;
        prev[1] = 0;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            prev[i] = i - 1;
            if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
                dp[i] = dp[i / 2] + 1;
                prev[i] = i / 2;
            }
            if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
                dp[i] = dp[i / 3] + 1;
                prev[i] = i / 3;
            }
        }
        StringBuilder answer = new StringBuilder();
        answer.append(dp[N]).append('\n');
        int cur = N;
        while (cur != 0) {
            answer.append(cur).append(' ');
            cur = prev[cur];
        }
        System.out.println(answer);
    }
}