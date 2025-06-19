import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        BigInteger area = new BigInteger(input);

        double side = Math.sqrt(area.doubleValue());
        double perimeter = 4.0 * side;

        System.out.printf("%.9f\n", perimeter);
    }
}