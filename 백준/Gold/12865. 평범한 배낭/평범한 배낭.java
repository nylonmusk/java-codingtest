import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] weights, values;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        weights = new int[N];
        values = new int[N];
        dp = new int[N + 1][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (weights[i - 1] > j) {
                    // 현재 물건의 무게가 배낭의 무게보다 크면 이전 아이템의 값을 그대로 가져옴
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 현재 물건의 무게가 배낭의 무게보다 작거나 같으면 이전 아이템의 값과 현재 아이템의 값을 더한 값 중 최대값 저장
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
