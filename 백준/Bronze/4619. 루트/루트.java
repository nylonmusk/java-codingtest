import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            int B = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);

            if (B == 0 && N == 0) {
                break;
            }

            int A = 1;
            int closestA = 1;
            double minDiff = Math.abs(Math.pow(A, N) - B);

            while (true) {
                double diff = Math.abs(Math.pow(A, N) - B);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestA = A;
                }

                if (Math.pow(A, N) > B) {
                    break;
                }

                A++;
            }

            System.out.println(closestA);
        }
    }
}