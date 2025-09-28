import java.io.*;
import java.util.*;

public class Main {
    private static long P, Q;
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());

        System.out.println(solve(N));
    }

    private static long solve(long n) {
        if (n == 0) return 1;
        if (memo.containsKey(n)) return memo.get(n);

        long result = solve(n / P) + solve(n / Q);
        memo.put(n, result);
        return result;
    }
}