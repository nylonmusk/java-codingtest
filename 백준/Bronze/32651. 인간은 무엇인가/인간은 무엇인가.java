import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        if (N % 2024 == 0 && N <= 100000) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}