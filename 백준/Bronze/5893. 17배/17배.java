import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryInput = br.readLine();

        BigInteger decimalValue = new BigInteger(binaryInput, 2);

        BigInteger result = decimalValue.multiply(BigInteger.valueOf(17));

        String answer = result.toString(2);

        System.out.println(answer);
    }
}
