import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bigInteger1 = new BigInteger(br.readLine());
        BigInteger bigInteger2 = new BigInteger(br.readLine());
        System.out.println(bigInteger1.add(bigInteger2));
    }
}