import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int[][] dp = new int[N + 1][N + 1];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                if (nums[j] == nums[j + i]) {
                    dp[j][j + i] = dp[j + 1][j + i - 1];
                } else {
                    dp[j][j + i] = Math.min(dp[j + 1][j + i], dp[j][j + i - 1]) + 1;
                }
            }
        }
        System.out.println(dp[1][N]);
    }
}
