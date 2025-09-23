import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pApercent = Integer.parseInt(br.readLine().trim());
        int pBpercent = Integer.parseInt(br.readLine().trim());
        int n = 18;

        double pA = pApercent / 100.0;
        double pB = pBpercent / 100.0;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j += i) isPrime[j] = false;
            }
        }

        double[] pmfA = binomialPMF(n, pA);
        double[] pmfB = binomialPMF(n, pB);

        double nonPrimeA = 0.0;
        double nonPrimeB = 0.0;
        for (int k = 0; k <= n; k++) {
            if (!isPrime[k]) nonPrimeA += pmfA[k];
            if (!isPrime[k]) nonPrimeB += pmfB[k];
        }

        double result = 1.0 - nonPrimeA * nonPrimeB;
        System.out.println(result);
    }

    private static double[] binomialPMF(int n, double p) {
        double[] dp = new double[n+1];
        dp[0] = 1.0;
        for (int i = 0; i < n; i++) {
            for (int k = i+1; k >= 1; k--) {
                dp[k] = dp[k] * (1.0 - p) + dp[k-1] * p;
            }
            dp[0] = dp[0] * (1.0 - p);
        }
        return dp;
    }
}