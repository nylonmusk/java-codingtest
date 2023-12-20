import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            answer.append(sum.remainder(BigInteger.valueOf(N)).equals(BigInteger.ZERO) ? "YES" : "NO").append("\n");
        }
        System.out.println(answer);
    }
}