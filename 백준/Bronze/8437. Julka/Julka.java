import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());

        System.out.println(total.add(diff).divide(BigInteger.valueOf(2)));
        System.out.println(total.subtract(diff).divide(BigInteger.valueOf(2)));
    }
}