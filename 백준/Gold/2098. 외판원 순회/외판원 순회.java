import java.io.*;

public class Main {
    private static final int INF = 1_000_000_000;
    private static int N;
    private static int[][] W;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        W = new int[N][N];
        dp = new int[1 << N][N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(tsp(1, 0));
    }

    private static int tsp(int visited, int current) {
        if (visited == (1 << N) - 1) {
            return W[current][0] == 0 ? INF : W[current][0];
        }

        if (dp[visited][current] != -1) return dp[visited][current];

        dp[visited][current] = INF;

        for (int next = 0; next < N; next++) {
            if ((visited & (1 << next)) == 0 && W[current][next] != 0) {
                int cost = W[current][next] + tsp(visited | (1 << next), next);
                dp[visited][current] = Math.min(dp[visited][current], cost);
            }
        }

        return dp[visited][current];
    }
}