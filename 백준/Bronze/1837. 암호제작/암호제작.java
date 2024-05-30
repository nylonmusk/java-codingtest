import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger P = new BigInteger(input[0]);
        int K = Integer.parseInt(input[1]);

        boolean[] isPrime = new boolean[K];
        for (int i = 2; i < K; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < K; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < K; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < K; i++) {
            if (isPrime[i] && P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                return;
            }
        }

        System.out.println("GOOD");
    }
}
