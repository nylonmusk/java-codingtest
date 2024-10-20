import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        int count = 0;

        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                long a = i;
                long b = N / i;

                if (a == b) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        System.out.println(count);
    }
}