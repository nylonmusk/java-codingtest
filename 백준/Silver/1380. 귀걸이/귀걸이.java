import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int scenario = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] names = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                names[i] = br.readLine();
            }

            int[] count = new int[n + 1];
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                st.nextToken();
                count[num]++;
            }

            int missingIndex = 0;
            for (int i = 1; i <= n; i++) {
                if (count[i] == 1) {
                    missingIndex = i;
                    break;
                }
            }

            answer.append(scenario++).append(" ").append(names[missingIndex]).append("\n");
        }

        System.out.print(answer);
    }
}