import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] line = new long[K];
        long maxLine = Integer.MIN_VALUE;

        for (int i = 0; i < K; i++) {
            line[i] = Long.parseLong(br.readLine());
            maxLine = Math.max(maxLine, line[i]);
        }

        long start = 1;
        long end = maxLine;
        long result = 0;

        while (end >= start) {
            long mid = (start + end) / 2;
            long count = 0;

            for (int i = 0; i < K; i++) {
                count += line[i] / mid;
            }

            if (count >= N) {
                start = mid + 1;
                result = Math.max(result, mid);
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}