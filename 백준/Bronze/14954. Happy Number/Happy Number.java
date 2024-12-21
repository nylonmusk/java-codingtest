import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = sumOfSquares(n);
        }

        if (n == 1) {
            System.out.println("HAPPY");
        } else {
            System.out.println("UNHAPPY");
        }
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}