import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger[] fibonacci = new BigInteger[N + 1];
        fibonacci[1] = BigInteger.ONE;

        if (N > 1) {
            fibonacci[2] = BigInteger.ONE;
            for (int i = 3; i <= N; i++) {
                fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
            }
        }
        System.out.println(fibonacci[N]);
    }
}