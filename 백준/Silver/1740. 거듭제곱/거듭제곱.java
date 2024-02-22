import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = getNthPowerSum(n);
        
        System.out.println(result);
    }

    private static long getNthPowerSum(long n) {
        long result = 0;
        long multiplier = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result += multiplier;
            }
            n /= 2;
            multiplier *= 3;
        }
        return result;
    }
}
