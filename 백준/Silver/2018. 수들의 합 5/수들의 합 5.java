import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());
        int count = 0;
        
        for (long k = 1; k * (k - 1) / 2 < N; k++) {
            long numerator = N - k * (k - 1) / 2;
            if (numerator % k == 0) {
                long a = numerator / k;
                if (a >= 1) count++;
            }
        }

        System.out.println(count);
    }
}