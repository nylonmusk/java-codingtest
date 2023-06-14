import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long[] P = new long[N + 1];
            if (N == 1 || N == 2) {
                sb.append(1).append("\n");
                continue;
            } else {
                P[1] = 1;
                P[2] = 1;
                for (int i = 3; i <= N; i++) {
                    P[i] = P[i - 2] + P[i - 3];
                }
            }
            sb.append(P[N]).append("\n");
        }
        System.out.println(sb.toString());
    }
}