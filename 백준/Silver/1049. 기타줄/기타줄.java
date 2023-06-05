import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minSet = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            minSet = Math.min(minSet, Integer.parseInt(st.nextToken()));
            minOne = Math.min(minOne, Integer.parseInt(st.nextToken()));
        }
        int answer = 0;
        while (N > 0) {
            if (minSet >= minOne * 6) {
                answer = N * minOne;
                break;
            } else {
                answer += N / 6 * minSet;
                N %= 6;
                if (N != 0 && minSet >= minOne * N) {
                    answer += N * minOne;
                    break;
                } else if (N != 0 && minSet < minOne * N) {
                    answer += minSet;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
