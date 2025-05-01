import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int total = N + M;

        int[] result = new int[total];

        st = new StringTokenizer(br.readLine());
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
            result[i] += S[i];
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < total; j++) {
                int give = Integer.parseInt(st.nextToken());
                if (give > 0) {
                    result[j] += give;
                    result[i] -= give;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < total; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}