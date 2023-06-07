import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] houses = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            houses[i][0] = Integer.parseInt(st.nextToken());
            houses[i][1] = Integer.parseInt(st.nextToken());
            houses[i][2] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][3];
        dp[0][0] = houses[0][0];
        dp[0][1] = houses[0][1];
        dp[0][2] = houses[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + houses[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + houses[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + houses[i][2];
        }
        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
    }
}
