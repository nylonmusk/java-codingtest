import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] dp = new int[D + 1];
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            for (int j = D; j > L; j--) {
                if (dp[j - L] == 0) {
                    continue;
                }
                dp[j] = Math.max(dp[j], Math.min(dp[j - L], C));
            }
            dp[L] = Math.max(dp[L], C);
        }
        System.out.println(dp[D]);
    }
}
