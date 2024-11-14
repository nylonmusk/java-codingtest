import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            int pagesPerCycle = S * T;
            int cycleTime = T + R;

            int cycles = N / pagesPerCycle;
            int remainingPages = N % pagesPerCycle;

            int totalTime;
            if (remainingPages == 0) {
                totalTime = cycles * cycleTime - R;
            } else {
                totalTime = cycles * cycleTime + (int) Math.ceil((double) remainingPages / S);
            }

            answer.append(totalTime).append("\n");
        }

        System.out.print(answer);
    }
}