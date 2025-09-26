import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = Long.parseLong(st.nextToken());
        }

        int[] visible = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                boolean ok = true;
                for (int k = i + 1; k < j; k++) {
                    if ((h[k] - h[i]) * (j - i) >= (h[j] - h[i]) * (k - i)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    visible[i]++;
                    visible[j]++;
                }
            }
        }

        int answer = 0;
        for (int v : visible) answer = Math.max(answer, v);
        System.out.println(answer);
    }
}