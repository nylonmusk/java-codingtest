import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }

        long discomfort = 0;

        for (int i = 0; i < n; i++) {
            int diff = T - k;
            if (diff > 0) {
                T = T + d[i] - diff;
            } else if (diff < 0) {
                T = T + d[i] + Math.abs(diff);
            } else {
                T = T + d[i];
            }

            discomfort += Math.abs(T - k);
        }

        System.out.println(discomfort);
    }
}