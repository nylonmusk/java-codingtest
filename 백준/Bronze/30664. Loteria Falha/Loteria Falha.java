import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        BigInteger divisor = new BigInteger("42");

        while (!(input = br.readLine()).equals("0")) {
            BigInteger num = new BigInteger(input);
            if (num.mod(divisor).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
    }
}