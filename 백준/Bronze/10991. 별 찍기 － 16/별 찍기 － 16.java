import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int j = 1; j <= N; j++) {
            for (int i = 1; i <= N - j; i++) {
                answer.append(" ");
            }
            for (int i = 1; i <= j; i++) {
                answer.append("*");
                if (i < j) {
                    answer.append(" ");
                }
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
