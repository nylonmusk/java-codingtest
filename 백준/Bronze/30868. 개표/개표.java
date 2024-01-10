import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int horizontalLines = n / 5;
            int verticalBars = n % 5;

            for (int i = 0; i < horizontalLines; i++) {
                answer.append("++++ ");
            }

            for (int i = 0; i < verticalBars; i++) {
                answer.append("|");
            }

            if (horizontalLines == 0 && verticalBars == 0) {
                answer.append("|");
            }

            answer.append("\n");
        }

        System.out.print(answer);
    }
}
