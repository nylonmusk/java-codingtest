import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] v = new int[n];
            int[] u = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                v[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                u[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;
            for (int i = 0; i < n; i++) {
                if (v[i] != u[i]) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}