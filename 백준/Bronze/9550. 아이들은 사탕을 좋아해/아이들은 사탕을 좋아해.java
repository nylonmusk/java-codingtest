import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] candies = new int[N];
            for (int i = 0; i < N; i++) {
                candies[i] = Integer.parseInt(st.nextToken());
            }

            int maxChildren = 0;
            for (int candy : candies) {
                maxChildren += candy / K;
            }

            answer.append(maxChildren).append("\n");
        }

        System.out.print(answer);
    }
}