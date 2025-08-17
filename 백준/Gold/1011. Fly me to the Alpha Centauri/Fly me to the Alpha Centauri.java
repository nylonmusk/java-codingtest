import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long d = y - x;
            sb.append(solve(d)).append("\n");
        }

        System.out.print(sb);
    }

    private static int solve(long d) {
        long k = (long) Math.sqrt(d);
        if (k * k == d) {
            return (int) (2 * k - 1);
        } else if (d <= k * (k + 1)) {
            return (int) (2 * k);
        } else {
            return (int) (2 * k + 1);
        }
    }
}