import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            answer.append("*".repeat(i)).append("\n");
        }

        for (int i = n - 1; i > 0; i--) {
            answer.append("*".repeat(i)).append("\n");
        }

        System.out.println(answer);
    }
}
