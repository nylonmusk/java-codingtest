import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] cake = new int[L + 1];

        int expectedMaxLength = 0;
        int expectedMaxPerson = 0;

        int[][] requests = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            requests[i][0] = P;
            requests[i][1] = K;
            int length = K - P + 1;
            if (length > expectedMaxLength) {
                expectedMaxLength = length;
                expectedMaxPerson = i;
            }
        }

        int[] actualCounts = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int P = requests[i][0];
            int K = requests[i][1];
            for (int j = P; j <= K; j++) {
                if (cake[j] == 0) {
                    cake[j] = i;
                    actualCounts[i]++;
                }
            }
        }

        int actualMaxCount = 0;
        int actualMaxPerson = 0;

        for (int i = 1; i <= N; i++) {
            if (actualCounts[i] > actualMaxCount) {
                actualMaxCount = actualCounts[i];
                actualMaxPerson = i;
            }
        }

        System.out.println(expectedMaxPerson);
        System.out.println(actualMaxPerson);
    }
}
