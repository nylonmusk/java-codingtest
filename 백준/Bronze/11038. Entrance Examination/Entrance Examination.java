import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int nMin = Integer.parseInt(st.nextToken());
            int nMax = Integer.parseInt(st.nextToken());

            if (m == 0 && nMin == 0 && nMax == 0) break;

            int[] scores = new int[m];
            for (int i = 0; i < m; i++) {
                scores[i] = Integer.parseInt(br.readLine());
            }

            int bestN = nMin;
            int maxGap = 0;

            for (int n = nMin; n <= nMax; n++) {
                int gap = scores[n - 1] - scores[n];
                if (gap > maxGap || (gap == maxGap && n > bestN)) {
                    maxGap = gap;
                    bestN = n;
                }
            }

            answer.append(bestN).append("\n");
        }

        System.out.print(answer);
    }
}
