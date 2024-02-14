import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                answer.append(" ");
            }
            answer.append("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                answer.append(" ");
            }
            if (i != 0) {
                answer.append("*");
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
