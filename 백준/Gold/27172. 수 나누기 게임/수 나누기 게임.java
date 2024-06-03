import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int maxElement = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
            maxElement = Math.max(maxElement, X[i]);
        }

        int[] P = new int[N + 1];
        int[] pos = new int[maxElement + 1];

        for (int i = 0; i < N; i++) {
            pos[X[i]] = i + 1;
        }

        for (int mod : X) {
            for (int i = mod * 2; i <= maxElement; i += mod) {
                if (pos[i] != 0) {
                    P[pos[i]]--;
                    P[pos[mod]]++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            answer.append(P[i]).append(" ");
        }
        System.out.print(answer);
    }
}
