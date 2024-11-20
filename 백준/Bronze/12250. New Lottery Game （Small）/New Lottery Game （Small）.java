import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int x = 0; x < A; x++) {
                for (int y = 0; y < B; y++) {
                    if ((x & y) < K) {
                        count++;
                    }
                }
            }

            answer.append("Case #").append(t).append(": ").append(count).append("\n");
        }
        System.out.print(answer);
    }
}