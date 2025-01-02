import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String result = x;

        while (true) {
            result = applyF(result);
            if (result.equals(x)) {
                System.out.println("FA");
                break;
            }
            if (result.length() == 1) {
                System.out.println("FA");
                break;
            }
        }
    }

    private static String applyF(String x) {
        int firstDigit = x.charAt(0) - '0';
        int numDigits = x.length();
        int result = firstDigit * numDigits;
        return String.valueOf(result);
    }
}