import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static char[] s;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        s = line.toCharArray();
        n = s.length;

        int answer = computeDP(s);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i] == s[j]) continue;
                char[] tmp = Arrays.copyOf(s, n);
                char t = tmp[i]; tmp[i] = tmp[j]; tmp[j] = t;
                int cost = computeDP(tmp) + 1;
                if (cost < answer) answer = cost;
            }
        }

        System.out.println(answer);
        
    }

    private static int computeDP(char[] arr) {
        int N = arr.length;
        int[][] dp = new int[N][N];
        for (int len = 2; len <= N; len++) {
            for (int l = 0; l + len - 1 < N; l++) {
                int r = l + len - 1;
                if (arr[l] == arr[r]) {
                    if (l + 1 <= r - 1) dp[l][r] = dp[l+1][r-1];
                    else dp[l][r] = 0;
                } else {
                    int a = dp[l+1][r] + 1;
                    int b = dp[l][r-1] + 1;
                    int c = (l+1 <= r-1 ? dp[l+1][r-1] + 1 : 1);
                    dp[l][r] = Math.min(a, Math.min(b, c));
                }
            }
        }
        return dp[0][N-1];
    }
}