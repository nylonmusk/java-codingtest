import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5 * N; j++) {
                answer.append("@");
            }
            answer.append("\n");
        }

        for (int i = 0; i < 3 * N; i++) {
            for (int j = 0; j < N; j++) {
                answer.append("@");
            }
            answer.append("\n");
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5 * N; j++) {
                answer.append("@");
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}