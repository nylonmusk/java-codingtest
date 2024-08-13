import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(calculateW(n));
        }
    }

    public static int calculateT(int n) {
        return n * (n + 1) / 2;
    }

    public static int calculateW(int n) {
        int result = 0;
        for (int k = 1; k <= n; k++) {
            result += k * calculateT(k + 1);
        }
        return result;
    }
}