import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        BigInteger answer = null;
        if (s.equals("+")) {
            answer = A.add(B);
        } else {
            answer = A.multiply(B);
        }

        System.out.println(answer);
    }
}
