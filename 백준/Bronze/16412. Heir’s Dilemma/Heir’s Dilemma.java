import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);

        int count = 0;

        for (int num = L; num <= H; num++) {
            if (isValidCombination(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isValidCombination(int num) {
        String s = String.valueOf(num);

        if (s.length() != 6 || hasDuplicateDigits(s)) {
            return false;
        }

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasDuplicateDigits(String s) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                return true;
            }
        }
        return false;
    }
}