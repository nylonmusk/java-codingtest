import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> tetra = new ArrayList<>();
        int i = 1;
        while (true) {
            int t = i * (i + 1) * (i + 2) / 6;
            if (t > N) break;
            tetra.add(t);
            i++;
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int t : tetra) {
            for (int j = t; j <= N; j++) {
                if (dp[j - t] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - t] + 1);
                }
            }
        }

        System.out.println(dp[N]);
    }
}