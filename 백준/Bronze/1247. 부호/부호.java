import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = 3;
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }
            if (sum.equals(BigInteger.ZERO)) {
                answer.append(0);
            } else if (sum.toString().contains("-")) {
                answer.append("-");
            } else {
                answer.append("+");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
