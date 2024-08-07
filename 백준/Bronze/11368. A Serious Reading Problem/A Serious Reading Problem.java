import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            int C = Integer.parseInt(parts[0]);
            int W = Integer.parseInt(parts[1]);
            int L = Integer.parseInt(parts[2]);
            int P = Integer.parseInt(parts[3]);

            if (C == 0 && W == 0 && L == 0 && P == 0) {
                break;
            }

            BigInteger base = BigInteger.valueOf(C);
            BigInteger exponent = BigInteger.valueOf(W).multiply(BigInteger.valueOf(L)).multiply(BigInteger.valueOf(P));
            BigInteger result = base.pow(exponent.intValue());

            System.out.println(result);
        }
    }
}