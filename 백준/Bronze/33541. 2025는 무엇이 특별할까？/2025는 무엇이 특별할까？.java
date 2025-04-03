import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        for (int Y = X + 1; Y <= 9999; Y++) {
            int firstTwo = Y / 100;
            int lastTwo = Y % 100;
            int sum = firstTwo + lastTwo;

            if (sum * sum == Y) {
                System.out.println(Y);
                return;
            }
        }

        System.out.println(-1);
    }
}