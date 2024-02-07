import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long[] prices = new long[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            long profit = 0;
            long maxValue = prices[N - 1];

            for (int i = N - 2; i >= 0; i--) {
                if (prices[i] > maxValue) {
                    maxValue = prices[i];
                } else {
                    profit += maxValue - prices[i];
                }
            }
            answer.append(profit).append("\n");
        }
        System.out.println(answer);
    }
}
