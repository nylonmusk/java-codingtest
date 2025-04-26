import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int k = 1; k <= K; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int distance = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                if (distance <= s * d) {
                    total += value;
                }
            }

            System.out.println("Data Set " + k + ":");
            System.out.println(total);
            System.out.println();
        }
    }
}