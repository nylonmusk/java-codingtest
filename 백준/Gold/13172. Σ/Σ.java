import java.io.*;
import java.util.*;

public class Main {
    private static final long MOD = 1_000_000_007L;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine().trim());
        long ans = 0;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            long S = Long.parseLong(st.nextToken());
            long invN = modPow(N, MOD - 2);
            ans = (ans + (S % MOD) * invN) % MOD;
        }
        System.out.println(ans);
    }

    private static long modPow(long a, long e) {
        long r = 1;
        a %= MOD;
        while (e > 0) {
            if ((e & 1) == 1) r = (r * a) % MOD;
            a = (a * a) % MOD;
            e >>= 1;
        }
        return r;
    }
}