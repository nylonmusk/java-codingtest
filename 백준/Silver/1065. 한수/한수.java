import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(countHansoo(n));
    }

    private static int countHansoo(int n) {
        if (n < 100) return n;
        int count = 99;
        for (int i = 100; i <= n; i++) {
            if (isHansoo(i)) count++;
        }
        return count;
    }

    private static boolean isHansoo(int num) {
        String s = String.valueOf(num);
        int d = (s.charAt(1) - s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if ((s.charAt(i+1) - s.charAt(i)) != d) {
                return false;
            }
        }
        return true;
    }
}