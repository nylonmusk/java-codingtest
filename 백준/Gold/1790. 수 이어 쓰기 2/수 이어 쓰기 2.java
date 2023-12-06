import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        if (getLength(N) < k) {
            System.out.println(-1);
        } else {
            System.out.println(findDigit(N, k));
        }
    }

    private static long getLength(long N) {
        long length = 0;
        long number = N;
        long base = 1;
        while (number > 0) {
            long next = Math.max(0, number - 9 * base);
            length += (number - next) * base;
            number = next;
            base *= 10;
        }
        return length;
    }

    private static int findDigit(long N, long k) {
        long base = 1;
        long number = 1;
        while (k > base * 9 * number) {
            k -= base * 9 * number;
            number++;
            base *= 10;
        }

        long target = base + (k - 1) / number;
        if (target > N) return -1;
        String targetStr = Long.toString(target);
        return Character.getNumericValue(targetStr.charAt((int) ((k - 1) % number)));
    }
}
