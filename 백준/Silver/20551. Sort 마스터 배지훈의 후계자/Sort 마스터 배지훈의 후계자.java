import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);

        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (!firstOccurrence.containsKey(A[i])) {
                firstOccurrence.put(A[i], i);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int D = Integer.parseInt(br.readLine());
            if (firstOccurrence.containsKey(D)) {
                answer.append(firstOccurrence.get(D)).append("\n");
            } else {
                answer.append(-1).append("\n");
            }
        }

        System.out.println(answer);
    }
}
