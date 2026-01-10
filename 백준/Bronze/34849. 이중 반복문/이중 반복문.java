import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        if (N * N <= 100_000_000L) {
            System.out.println("Accepted");
        } else {
            System.out.println("Time limit exceeded");
        }
    }
}