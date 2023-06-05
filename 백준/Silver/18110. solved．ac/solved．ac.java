import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] opinion = new int[N];
        for (int i = 0; i < N; i++) {
            opinion[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(opinion);
        int exception = (int) Math.round(N / 100.0 * 15);
        int sum = 0;
        for (int i = exception; i < N - exception; i++) {
            sum += opinion[i];
        }
        System.out.println((int) Math.round(sum / (N - exception * 2.0)));
    }
}
