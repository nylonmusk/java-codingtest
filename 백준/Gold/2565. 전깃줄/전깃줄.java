import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Wire implements Comparable<Wire> {
        int a, b;

        Wire(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Wire other) {
            return this.a - other.a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Wire[] wires = new Wire[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            wires[i] = new Wire(a, b);
        }

        Arrays.sort(wires);

        int[] dp = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(dp, 0, len, wires[i].b);
            if (pos < 0) pos = -(pos + 1);
            dp[pos] = wires[i].b;
            if (pos == len) len++;
        }

        System.out.println(n - len);
    }
}