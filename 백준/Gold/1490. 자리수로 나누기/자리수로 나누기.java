import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> digits = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Nstr = br.readLine().trim();
        long N = Long.parseLong(Nstr);

        for (char c : Nstr.toCharArray()) {
            if (c != '0') digits.add(c - '0');
        }

        long result = findNumber(N);
        System.out.println(result);
    }

    private static long findNumber(long N) {
        for (int k = 0; k <= 12; k++) {
            long base = (long) Math.pow(10, k);
            long start = N * base;
            long end = (N + 1) * base;

            for (long x = start; x < end; x++) {
                if (divisible(x)) return x;
            }
        }
        return -1;
    }

    private static boolean divisible(long x) {
        for (int d : digits) {
            if (x % d != 0) return false;
        }
        return true;
    }
}