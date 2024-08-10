import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] total = new int[N];

        for (int i = 0; i < N; i++) {
            total[i] = Integer.parseInt(br.readLine());
        }

        int[] candy = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += total[i];
            } else {
                sum -= total[i];
            }
        }

        candy[0] = sum / 2;

        for (int i = 1; i < N; i++) {
            candy[i] = total[i - 1] - candy[i - 1];
        }

        for (int i = 0; i < N; i++) {
            System.out.println(candy[i]);
        }
    }
}