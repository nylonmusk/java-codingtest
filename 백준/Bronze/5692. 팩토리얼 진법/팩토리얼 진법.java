import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("0")) {
            int length = line.length();
            int answer = 0;

            for (int i = 0; i < length; i++) {
                int digit = line.charAt(i) - '0';
                answer += digit * factorial(length - i);
            }

            System.out.println(answer);
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}