import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int totalSquares = 0;
            for (int i = 1; i <= N; i++) {
                totalSquares += i * i;
            }
            System.out.println(totalSquares);
        }
    }
}