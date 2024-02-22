import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] S;
    static int[] B;
    static int minDiff;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        B = new int[N];
        minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        cook(0, 1, 0);

        System.out.println(minDiff);
    }

    static void cook(int idx, int s, int b) {
        if (idx == N) {
            if (s != 1 && b != 0) {
                minDiff = Math.min(minDiff, Math.abs(s - b));
            }
            return;
        }

        cook(idx + 1, s * S[idx], b + B[idx]);
        cook(idx + 1, s, b);
    }
}
