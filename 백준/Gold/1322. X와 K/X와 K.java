import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long Y = 0;
        int bitPos = 0;
        int kBitPos = 0;

        while (K > 0 || bitPos < 64) {
            if ((X & (1L << bitPos)) == 0) {
                if ((K & (1L << kBitPos)) != 0) {
                    Y |= (1L << bitPos);
                }
                kBitPos++;
                if ((1L << kBitPos) > K && K == 0) break;
            }
            bitPos++;
            if (K > 0 && (1L << kBitPos) <= K) {
            }
            if ((K & (1L << (kBitPos - 1))) != 0) {
            }
            if (bitPos > 64) break;
            if (kBitPos > 0 && (K & (1L << (kBitPos - 1))) != 0) {
                K &= ~(1L << (kBitPos - 1));
            }
        }

        System.out.println(Y);
    }
}