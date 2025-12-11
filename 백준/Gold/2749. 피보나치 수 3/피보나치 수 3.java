import java.io.*;

public class Main {
    private static final int MOD = 1000000;
    private static final int P = 1500000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int idx = (int)(n % P);

        int[] fib = new int[P];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < P; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % MOD;
        }

        System.out.println(fib[idx]);
    }
}