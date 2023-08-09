import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] roadLengths = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            roadLengths[i] = Integer.parseInt(st.nextToken());
        }

        int[] prices = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        int minPrice = prices[0];
        for (int i = 0; i < roadLengths.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            answer += (long) minPrice * roadLengths[i];
        }
        System.out.println(answer);
    }
}

