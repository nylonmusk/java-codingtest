import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long N = 0;
        long sum = 0;

        while (true) {
            if (sum > S) break;
            sum += N;
            N++;
        }
        System.out.println(N - 2);
    }
}