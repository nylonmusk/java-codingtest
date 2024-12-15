import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] players = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int player = Integer.parseInt(st.nextToken());
            players[player]++;
        }

        int max = Integer.MIN_VALUE;
        int answer = -1;
        boolean isTie = false;

        for (int i = 1; i <= N; i++) {
            if (players[i] > max) {
                max = players[i];
                answer = i;
                isTie = false;
            } else if (players[i] == max) {
                isTie = true;
            }
        }

        System.out.println(isTie ? "skipped" : answer);
    }
}