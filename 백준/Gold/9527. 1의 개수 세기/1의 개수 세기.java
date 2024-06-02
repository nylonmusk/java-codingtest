import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(countOnesInRange(A, B));
    }

    public static long countOnesInRange(long A, long B) {
        return countOnes(B) - countOnes(A - 1);
    }

    public static long countOnes(long n) {
        long count = 0;
        long factor = 1;

        while (factor <= n) {
            long completePairs = n / (factor * 2);
            long remainder = n % (factor * 2);
            long currentBitOnes = Math.max(0, remainder - factor + 1);

            count += completePairs * factor + currentBitOnes;
            factor <<= 1;
        }

        return count;
    }
}
