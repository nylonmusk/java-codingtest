import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int N = Integer.parseInt(br.readLine());

        int[] cows = new int[N + 1];
        Arrays.fill(cows, INF);

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if (cows[cow] == INF) {
                cows[cow] = location;
                continue;
            }

            if (cows[cow] != location) {
                cows[cow] = location;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
