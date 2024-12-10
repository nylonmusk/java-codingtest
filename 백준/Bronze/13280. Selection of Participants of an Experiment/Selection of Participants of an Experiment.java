import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores);

            int minDifference = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                minDifference = Math.min(minDifference, scores[i] - scores[i - 1]);
            }

            answer.append(minDifference).append("\n");
        }

        System.out.print(answer);
    }
}