import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] memory = new int[N];
        int[] cost = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            memory[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int MAX_COST = 100 * N;
        int[] dp = new int[MAX_COST + 1];

        for (int i = 0; i <= MAX_COST; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = MAX_COST; j >= cost[i]; j--) {
                if (dp[j - cost[i]] != -1) {
                    dp[j] = Math.max(dp[j], dp[j - cost[i]] + memory[i]);
                }
            }
        }

        int answer = -1;
        for (int i = 0; i <= MAX_COST; i++) {
            if (dp[i] >= M) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
