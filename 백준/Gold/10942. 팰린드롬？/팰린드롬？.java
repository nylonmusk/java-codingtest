import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) a[i] = Integer.parseInt(st.nextToken());
        boolean[][] dp = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++) dp[i][i] = true;
        for (int i = 1; i < N; i++) if (a[i] == a[i + 1]) dp[i][i + 1] = true;
        for (int len = 3; len <= N; len++) {
            for (int i = 1; i + len - 1 <= N; i++) {
                int j = i + len - 1;
                if (a[i] == a[j] && dp[i + 1][j - 1]) dp[i][j] = true;
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            answer.append(dp[s][e] ? "1" : "0").append('\n');
        }
        System.out.print(answer);
    }
}