import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] degrees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            degrees[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = K;

        int answer = Integer.MIN_VALUE;
        while (start <= N - K && end <= N) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += degrees[i];
            }
            answer = Math.max(answer, sum);
            start++;
            end++;
        }
        System.out.println(answer);
    }
}
